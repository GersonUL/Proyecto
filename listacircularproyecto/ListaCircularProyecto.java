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
          Ventana v=new Ventana();
          v.setVisible(true);
        MovieData md=new MovieData();
         md.leerArchivo();
         System.out.println("buscando");
        System.out.println(md.buscarPelicula("Postman, The (Il Postino)"));
        //md.insertar(m);
       
    }
    
}
