/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircularproyecto;

import Data.MovieData;
import Domain.Movie;
import GUI.Ventana;
import java.io.IOException;

/**
 *
 * @author gerson
 */
public class ListaCircularProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       Pelicula m=new Pelicula(1,1,3,4,5,"playaso");
       Pelicula m1=new Pelicula(1,1,3,4,5,"a");   
       Pelicula m2=new Pelicula(1,1,3,4,5,"araña");
       Pelicula m3=new Pelicula(1,1,3,4,5,"iguana");
       Pelicula m4=new Pelicula(1,1,3,4,5,"pablo");
       Pelicula m5=new Pelicula(1,1,3,4,5,"gerson");
       Pelicula m6=new Pelicula(1,1,3,4,5,"puto");
       Pelicula m7=new Pelicula(1,1,3,4,5,"guaro");
       CircularList cl=new CircularList();
       cl.insertOrder(m);
       cl.insertOrder(m1);
       cl.insertOrder(m2);
       cl.insertOrder(m3);
       cl.insertOrder(m4);
       cl.insertOrder(m5);
       cl.insertOrder(m6);
       cl.insertOrder(m7);
       
       cl.printList();
//          Ventana v=new Ventana();
//          v.setVisible(true);
//          
//        MovieData md=new MovieData();
//        md.readFile();
//        md.insertar(m);
    }
    
}
