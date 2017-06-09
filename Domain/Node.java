/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Domain.Movie;

/**
 *
 * @author gerson
 */
public class Node {

    private Movie pelicula;
    private Node nextPtr, previosPtr;

    public Node() {
        this.pelicula = new Movie();
        this.nextPtr = null;
        this.previosPtr = null;
    }//const

    public Node(Movie movie, Node next, Node prev) {
        this.pelicula = movie;
        this.nextPtr = next;
        this.previosPtr = prev;
    }//const

    public Movie getPelicula() {
        return pelicula;
    }

    public void setPelicula(Movie pelicula) {
        this.pelicula = pelicula;
    }

    public Node getNextPtr() {
        return nextPtr;
    }

    public void setNextPtr(Node nextPtr) {
        this.nextPtr = nextPtr;
    }

    public Node getPreviosPtr() {
        return previosPtr;
    }

    public void setPreviosPtr(Node previosPtr) {
        this.previosPtr = previosPtr;
    }
}//class
