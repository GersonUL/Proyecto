/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircularproyecto;

import Domain.Pelicula;
import Data.MovieData;
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
       Pelicula m=new Pelicula("","playa",1+"",2+"",4+"",6+"");
       Pelicula m1=new Pelicula("","a",1+"",6+"",9+"",1+"");   
       Pelicula m2=new Pelicula("","araña",1+"",4+""+"",7+"",0+"");
          Ventana v=new Ventana();
          v.setVisible(true);
        MovieData md=new MovieData();
        //md.insertar(m);
        md.leerArchivo();
    }
    
}
