/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Movie;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.csvreader.CsvWriter;

/**
 *
 * @author Pablo Rojas Martínez
 */
public class MovieData {
    
    File file = new File("datos.csv");
    
    public List<Movie> readFile() throws IOException {
        List<Movie> list = new ArrayList<Movie>();
        BufferedReader br = null;
        int count = 0;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (null != line) {
                String[] rows = line.split(",");
                if (count != 0) {
                    Movie movie = new Movie(Integer.parseInt(rows[0]), rows[1], rows[2], Integer.parseInt(rows[3]), Integer.parseInt(rows[4]), Integer.parseInt(rows[5]));
                    list.add(movie);
                }
                System.out.println(Arrays.toString(rows));
                line = br.readLine();
                count++;
            }
        } catch (Exception e) {

        } finally {
            if (null != br) {
                br.close();
            }
        }

        return list;
    }
    
   public void insertar(Movie movie) throws FileNotFoundException, IOException {
        boolean alreadyExists = new File("datos").exists();

        if (alreadyExists) {
            File archivoPelicula = new File("datos");
            archivoPelicula.delete();
        }
        try {
            CsvWriter csvOutPut = new CsvWriter(new FileWriter(file, true), ',');

            csvOutPut.write(Integer.toString(movie.getCode()));
            csvOutPut.write(movie.getTitle());
            csvOutPut.write(movie.getGender());
            csvOutPut.write(Integer.toString(movie.getTotal()));
            csvOutPut.write(Integer.toString(movie.getSubtitled()));
            csvOutPut.write(Integer.toString(movie.getPremier()));
            csvOutPut.endRecord();
            csvOutPut.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//insertar
    
}// class
