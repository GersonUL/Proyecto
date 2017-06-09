/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Data.MovieData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Domain.CircularList;

/**
 *
 * @author jeannette
 */
public class DividirPorListas {
    private ArrayList<Pelicula> arregloGeneral;
    MovieData movieData=new MovieData();    
    CircularList listaGeneral = new CircularList();
    CircularList listAction = new CircularList();
    CircularList listaDrama = new CircularList();
    CircularList listComedy = new CircularList();
    CircularList listChildish = new CircularList();
    CircularList listRomance = new CircularList();
    CircularList listFiction = new CircularList();

    public DividirPorListas() {
        arregloGeneral=movieData.leerArchivo();
        insertarEnListas();
    }
    
    public void insertarEnListas(){
        for (int i = 0; i < arregloGeneral.size(); i++) {
            Pelicula peliculaNueva=arregloGeneral.get(i);
        
        if (peliculaNueva.getGender().equals("1000")) {
                    listaDrama.insertInOrder(peliculaNueva);
                } else if (peliculaNueva.getGender().equals("2000")) {
                    listComedy.insertInOrder(peliculaNueva);
                } else if (peliculaNueva.getGender().equals("3000")) {
                    listChildish.insertInOrder(peliculaNueva);
                } else if (peliculaNueva.getGender().equals("4000")) {
                    listAction.insertInOrder(peliculaNueva);
                } else if (peliculaNueva.getGender().equals("5000")) {
                    listRomance.insertInOrder(peliculaNueva);
                } else if (peliculaNueva.getGender().equals("6000")) {
                    listFiction.insertInOrder(peliculaNueva);
                } else {
                    System.out.println("Invalido");
                }
        }        
    }
    public CircularList getListaGeneral() {
        return listaGeneral;
    }

    public CircularList getListAction() {
        return listAction;
    }

    public CircularList getListDrama() {
        return listaDrama;
    }

    public CircularList getListComedy() {
        return listComedy;
    }

    public CircularList getListChildish() {
        return listChildish;
    }

    public CircularList getListRomance() {
        return listRomance;
    }

    public CircularList getListFiction() {
        return listFiction;
    }
    
}
