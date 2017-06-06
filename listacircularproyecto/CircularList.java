/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircularproyecto;

import Domain.Pelicula;

/**
 *
 * @author gerson
 */
public class CircularList {
    private Nodo head,tail,temp;
    public CircularList(){
        this.head=null;
        this.tail=null;
        this.temp=null;
    }//const
    public void insertInOrder(Pelicula pelicula) {
        Nodo newPtr = new Nodo();
        newPtr.setPelicula(pelicula);
        Nodo temp = head;

        while (temp != null && temp.getPelicula().getTitle().compareTo(newPtr.getPelicula().getTitle()) < 0) {
            if (temp == tail) {
                break;
            }//if para saber si llego al final de la lista
            temp = temp.getNextPtr();
        }//while para recorrer la lista
        //preguntar porque se detuvo
        if (temp == null) {
            head=newPtr;
            temp=head;
            tail=head;
            head.setPreviosPtr(tail);
            tail.setNextPtr(head);
        } else {
            if (temp == head) {
                if (temp.getPelicula().getTitle().compareTo(newPtr.getPelicula().getTitle()) > 0) {
                    newPtr.setNextPtr(head);
                    newPtr.setPreviosPtr(tail);
                    head.setPreviosPtr(newPtr);
                    head=newPtr;
                    tail.setNextPtr(head);
                    head.setPreviosPtr(tail);
                } else {
                    newPtr.setPreviosPtr(head);
                    newPtr.setNextPtr(tail);
                    head.setNextPtr(newPtr);
                    tail=newPtr;
                    tail.setNextPtr(head);
                   head.setPreviosPtr(tail);
                }//if si el nuevo nodo va antes o despues de head
            } else {
                if (temp == tail && temp.getPelicula().getTitle().compareTo(newPtr.getPelicula().getTitle()) < 0) {
                    newPtr.setPreviosPtr(tail);
                    newPtr.setNextPtr(head);
                    tail.setNextPtr(newPtr);
                    tail=newPtr;
                    head.setPreviosPtr(tail);
                    tail.setNextPtr(head);
                } else {
                    temp.getPreviosPtr().setNextPtr(newPtr);
                    newPtr.setPreviosPtr(temp.getPreviosPtr());
                    newPtr.setNextPtr(temp);
                    temp.setPreviosPtr(newPtr);
                }//if para saber si el nuevo nodo va despues de tail o esta en medio de la lista
            }//if el en que posicion va el nuevo nodo
        }//if la lista esta llena o no
    }//fin method

//    public void insertOrder(Pelicula p){
//        Nodo newPtr=new Nodo();
//        Nodo previous=new Nodo();
//        newPtr.setPelicula(p);
//        temp=head;
//        if(temp==null){
//            head=newPtr;
//            temp=head;
//            tail=head;
//            head.setPreviosPtr(tail);
//            tail.setNextPtr(head);
//        }else{
//            if(newPtr.getPelicula().getTitle().compareTo(head.getPelicula().getTitle())<0){
//                newPtr.setNextPtr(head);
//                newPtr.setPreviosPtr(tail);
//                head=newPtr;
//            }else{
//                temp=head;
//                previous=head;
//                while(newPtr.getPelicula().getTitle().compareTo(temp.getPelicula().getTitle())>=0 && temp.getNextPtr()!=null){
//                    previous=temp;
//                    temp=temp.getNextPtr();
//                }
//                if(newPtr.getPelicula().getTitle().compareTo(temp.getPelicula().getTitle())>0){
//                    newPtr.setNextPtr(head);
//                    newPtr.setPreviosPtr(tail);
//                    head.setPreviosPtr(newPtr);
//                    head=newPtr;
//                    tail.setNextPtr(head);
//                    head.setPreviosPtr(tail);
//                }else{
//                    newPtr.setPreviosPtr(head);
//                    newPtr.setNextPtr(tail);
//                    head.setNextPtr(newPtr);
//                    tail=newPtr;
//                    tail.setNextPtr(head);
//                    head.setPreviosPtr(tail);
//                }
//            }
//        }
//        
//    }//insertOrder
    public void printList(){
        temp=head;
        System.out.println(temp.getPelicula().toString());
        temp=temp.getNextPtr();
        while(temp!=head){
            System.out.println(temp.getPelicula().toString());
            temp=temp.getNextPtr();
        }
    }//print
}//class
