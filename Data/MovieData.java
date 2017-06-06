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
import listacircularproyecto.CircularList;

/**
 *
 * @author Pablo Rojas Martínez
 */
public class MovieData {

    ArrayList<Pelicula> arrayPeliculas = new ArrayList<>();
    CircularList listaGeneral = new CircularList();
    CircularList action = new CircularList();
    CircularList drama = new CircularList();
    CircularList comedy = new CircularList();
    CircularList childish = new CircularList();
    CircularList romance = new CircularList();
    CircularList fiction = new CircularList();
    File file = new File("datos.csv");
    
    public ArrayList<Pelicula>  leerArchivo() {
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
                peliculaNueva.setPremier((premier));
                listaGeneral.insertInOrder(peliculaNueva);
                arrayPeliculas.add(peliculaNueva);
                if (peliculaNueva.getGender().equals("1000")) {
                    drama.insertInOrder(peliculaNueva);
                } else if (peliculaNueva.getGender().equals("2000")) {
                    comedy.insertInOrder(peliculaNueva);
                } else if (peliculaNueva.getGender().equals("3000")) {
                    childish.insertInOrder(peliculaNueva);
                } else if (peliculaNueva.getGender().equals("4000")) {
                    action.insertInOrder(peliculaNueva);
                } else if (peliculaNueva.getGender().equals("5000")) {
                    romance.insertInOrder(peliculaNueva);
                } else if (peliculaNueva.getGender().equals("6000")) {
                    fiction.insertInOrder(peliculaNueva);
                } else {
                    System.out.println("Invalido");
                }
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
        Pelicula pelicula = new Pelicula();
        for (int i = 0; i < arrayPeliculas.size(); i++) {
            if (arrayPeliculas.get(i).getTitle().equals(nombre)) {
                return arrayPeliculas.get(i);
            }
        }
        return null;
    }//cargar
    
    public CircularList listaDrama(){
        return this.drama;
    }
    
    public CircularList listaComedy(){
        return this.comedy;
    }
    
    public CircularList listaChildish(){
        return this.childish;
    }
    
}// class
