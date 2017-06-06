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
    CircularList listaGeneral = new CircularList();
    CircularList action=new CircularList();
    CircularList drama=new CircularList();
    CircularList comedy=new CircularList();
    CircularList childish=new CircularList();
    CircularList romance=new CircularList();
    CircularList fiction=new CircularList();
    File file = new File("datos.csv");    
    
    public void leerArchivo() {
        ArrayList<Pelicula> lista1 = new ArrayList<>();
        try {
            CsvReader empleados_import = new CsvReader("datos.csv");
            empleados_import.readHeaders();
            while (empleados_import.readRecord()){
                Pelicula peliNueva = new Pelicula();
                String codigo = (empleados_import.get(0));
                String titulo = empleados_import.get(1);
                String genero = (empleados_import.get(2));
                String total = (empleados_import.get(3));
                String subtitulo = (empleados_import.get(4));
                String premier = (empleados_import.get(5));
                peliNueva.setCode((codigo));
                peliNueva.setTitle(titulo);
                peliNueva.setGender((genero));
                peliNueva.setTotal((total));
                peliNueva.setSubtitled((subtitulo));
                peliNueva.setPremier((premier)); 
                listaGeneral.insertInOrder(peliNueva);
                lista1.add(peliNueva);
                if(peliNueva.getGender().equals("1000")){
                    drama.insertInOrder(peliNueva);
                }else  if(peliNueva.getGender().equals("2000")){
                    comedy.insertInOrder(peliNueva);
                }else if(peliNueva.getGender().equals("3000")){
                    childish.insertInOrder(peliNueva);
                }else if(peliNueva.getGender().equals("4000")){
                    action.insertInOrder(peliNueva);
                }else if(peliNueva.getGender().equals("5000")){
                    romance.insertInOrder(peliNueva);
                } else if(peliNueva.getGender().equals("6000")){
                    fiction.insertInOrder(peliNueva);
                }else{
                    System.out.println("Invalido");  
                }
            }
            empleados_import.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        romance.printList();        
    }//leerArchivo
}// class
