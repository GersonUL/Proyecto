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
public class CircularList {

    private Node head, tail, temp;

    public CircularList() {
        this.head = null;
        this.tail = null;
        this.temp = null;
    }//const

    public void insertInOrder(Movie pelicula) {
        Node newPtr = new Node();
        newPtr.setPelicula(pelicula);
        Node temp = head;

        while (temp != null && temp.getPelicula().getTitle().compareTo(newPtr.getPelicula().getTitle()) < 0) {
            if (temp == tail) {
                break;
            }
            temp = temp.getNextPtr();
        }
        if (temp == null) {
            head = newPtr;
            temp = head;
            tail = head;
            head.setPreviosPtr(tail);
            tail.setNextPtr(head);
        } else {
            if (temp == head) {
                if (temp.getPelicula().getTitle().compareTo(newPtr.getPelicula().getTitle()) > 0) {
                    newPtr.setNextPtr(head);
                    newPtr.setPreviosPtr(tail);
                    head.setPreviosPtr(newPtr);
                    head = newPtr;
                    tail.setNextPtr(head);
                    head.setPreviosPtr(tail);
                } else {
                    newPtr.setPreviosPtr(head);
                    newPtr.setNextPtr(tail);
                    head.setNextPtr(newPtr);
                    tail = newPtr;
                    tail.setNextPtr(head);
                    head.setPreviosPtr(tail);
                }
            } else {
                if (temp == tail && temp.getPelicula().getTitle().compareTo(newPtr.getPelicula().getTitle()) < 0) {
                    newPtr.setPreviosPtr(tail);
                    newPtr.setNextPtr(head);
                    tail.setNextPtr(newPtr);
                    tail = newPtr;
                    head.setPreviosPtr(tail);
                    tail.setNextPtr(head);
                } else {
                    temp.getPreviosPtr().setNextPtr(newPtr);
                    newPtr.setPreviosPtr(temp.getPreviosPtr());
                    newPtr.setNextPtr(temp);
                    temp.setPreviosPtr(newPtr);
                }
            }
        }
    }//insert

    public String printList() {
        String cad = "";
        temp = head;
        cad += temp.getPelicula().toString() + "";
// System.out.println(temp.getPelicula().toString());
        temp = temp.getNextPtr();
        while (temp != head) {
            cad += temp.getPelicula().toString() + "";
            //System.out.println(temp.getPelicula().toString());
            temp = temp.getNextPtr();
        }
        return cad;
    }//print
}//class
