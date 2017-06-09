/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.csvreader.CsvWriter;
import Domain.Movie;
import com.csvreader.CsvReader;
import Domain.CircularList;

/**
 *
 * @author Pablo Rojas Martínez
 */
public class MovieData {

    ArrayList<Movie> arrayMovies = new ArrayList<>();
    CircularList generalList = new CircularList();
    CircularList action = new CircularList();
    CircularList drama = new CircularList();
    CircularList comedy = new CircularList();
    CircularList childish = new CircularList();
    CircularList romance = new CircularList();
    CircularList fiction = new CircularList();

    File file = new File("datos.csv");

    public void insertFile(Movie movie) {
        boolean fileExists = new File("datos").exists();
        if (fileExists) {
            File newFile = new File("datos");
            newFile.delete();
        }
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(file, true), ',');
            csvOutput.write((movie.getCode()));
            csvOutput.write(movie.getTitle());
            csvOutput.write(movie.getGender());
            csvOutput.write(movie.getTotal());
            csvOutput.write(movie.getSubtitled());
            csvOutput.write(movie.getPremier());
            csvOutput.endRecord();
            csvOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Movie> readFile() {
        try {
            CsvReader getMovie = new CsvReader("datos.csv");
            getMovie.readHeaders();
            while (getMovie.readRecord()) {
                Movie newMovie = new Movie();
                String code = (getMovie.get(0));
                String title = getMovie.get(1);
                String gendre = (getMovie.get(2));
                String total = (getMovie.get(3));
                String subtitled = (getMovie.get(4));
                String premier = (getMovie.get(5));
                newMovie.setCode((code));
                newMovie.setTitle(title);
                newMovie.setGender((gendre));
                newMovie.setTotal((total));
                newMovie.setSubtitled((subtitled));
                newMovie.setPremier((premier) + "\n\n");
                generalList.insertInOrder(newMovie);
                arrayMovies.add(newMovie);

            }
            getMovie.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayMovies;
    }//leerArchivo

    public Movie searchMovies(String name) {
        for (int i = 0; i < arrayMovies.size(); i++) {
            if (arrayMovies.get(i).getTitle().equals(name)) {
                return arrayMovies.get(i);
            }
        }
        return null;
    }//cargar

}// class
