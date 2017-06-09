/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
import Domain.Pelicula;
import com.csvreader.CsvReader;
import Domain.CircularList;

/**
 *
 * @author gerson
 */
public class MovieData {

    ArrayList<Pelicula> arrayPeliculas = new ArrayList<>();
    ArrayList<Pelicula> arrayDrama = new ArrayList<>();
//    ArrayList<Pelicula> arrayPeliculas = new ArrayList<>();
//    ArrayList<Pelicula> arrayPeliculas = new ArrayList<>();
//    ArrayList<Pelicula> arrayPeliculas = new ArrayList<>();
//    ArrayList<Pelicula> arrayPeliculas = new ArrayList<>();

    CircularList listaGeneral = new CircularList();
    CircularList action = new CircularList();
    CircularList drama = new CircularList();
    CircularList comedy = new CircularList();
    CircularList childish = new CircularList();
    CircularList romance = new CircularList();
    CircularList fiction = new CircularList();
    File file = new File("datos.csv");

    public void insertarArchivo(Pelicula pelicula) {

        //String outputFile = "Empleados3.csv";
        boolean alreadyExists = new File("datos").exists();

        if (alreadyExists) {
            File ArchivoEmpleados = new File("datos");
            ArchivoEmpleados.delete();
        }

        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(file, true), ',');

            csvOutput.write((pelicula.getCode()));
            csvOutput.write(pelicula.getTitle());
            csvOutput.write(pelicula.getGender());
            csvOutput.write(pelicula.getTotal());
            csvOutput.write(pelicula.getSubtitled());
            csvOutput.write(pelicula.getPremier());
            csvOutput.endRecord();
            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Pelicula> leerArchivo() {
        try {
            CsvReader obtenerPelicula = new CsvReader("datos.csv");
            obtenerPelicula.readHeaders();
            while (obtenerPelicula.readRecord()) {
                Pelicula peliculaNueva = new Pelicula();
                String codigo = (obtenerPelicula.get(0));
                String titulo = obtenerPelicula.get(1);
                String genero = (obtenerPelicula.get(2));
                String total = (obtenerPelicula.get(3));
                String subtitulo = (obtenerPelicula.get(4));
                String premier = (obtenerPelicula.get(5));
                peliculaNueva.setCode((codigo));
                peliculaNueva.setTitle(titulo);
                peliculaNueva.setGender((genero));
                peliculaNueva.setTotal((total));
                peliculaNueva.setSubtitled((subtitulo));
                peliculaNueva.setPremier((premier) + "\n\n");
                listaGeneral.insertInOrder(peliculaNueva);
                arrayPeliculas.add(peliculaNueva);

            }
            obtenerPelicula.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayPeliculas;
    }//leerArchivo

    public Pelicula buscarPelicula(String nombre) {
        for (int i = 0; i < arrayPeliculas.size(); i++) {
            if (arrayPeliculas.get(i).getTitle().equals(nombre)) {
                return arrayPeliculas.get(i);
            }
        }
        return null;
    }//buscar

    public CircularList listaDrama() {
        return this.drama;
    }

    public CircularList listaComedy() {
        return this.comedy;
    }

    public CircularList listaChildish() {
        return this.childish;
    }

}// class
