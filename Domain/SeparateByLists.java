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
public class SeparateByLists {
    
    private ArrayList<Movie> generalArray;
    MovieData movieData=new MovieData();    
    CircularList generalList = new CircularList();
    CircularList listAction = new CircularList();
    CircularList listaDrama = new CircularList();
    CircularList listComedy = new CircularList();
    CircularList listChildish = new CircularList();
    CircularList listRomance = new CircularList();
    CircularList listFiction = new CircularList();

    public SeparateByLists() {
        generalArray=movieData.readFile();
        insertInLists();
    }
    
    public void insertInLists(){
        for (int i = 0; i < generalArray.size(); i++) {
            Movie newMovie=generalArray.get(i);
        
        if (newMovie.getGender().equals("1000")) {
                    listaDrama.insertInOrder(newMovie);
                } else if (newMovie.getGender().equals("2000")) {
                    listComedy.insertInOrder(newMovie);
                } else if (newMovie.getGender().equals("3000")) {
                    listChildish.insertInOrder(newMovie);
                } else if (newMovie.getGender().equals("4000")) {
                    listAction.insertInOrder(newMovie);
                } else if (newMovie.getGender().equals("5000")) {
                    listRomance.insertInOrder(newMovie);
                } else if (newMovie.getGender().equals("6000")) {
                    listFiction.insertInOrder(newMovie);
                } else {
                    System.out.println("Wrong");
                }
        }        
    }
    public CircularList getListaGeneral() {
        return generalList;
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
