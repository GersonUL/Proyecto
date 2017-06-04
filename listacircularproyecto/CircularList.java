/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircularproyecto;

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
    public void insertIntoHead(Pelicula p){
        Nodo newPtr=new Nodo();
        Nodo temporal=new Nodo();
        newPtr.setPelicula(p);
        temporal=head;
        if(temporal==null){
            head=newPtr;
            tail=newPtr;
            head.setNextPtr(tail);
            tail.setNextPtr(head);
        }else{
            temporal=head;
            head=newPtr;
            head.setNextPtr(temporal);
            temporal.setPreviosPtr(head);
            tail.setNextPtr(head);
            head.setPreviosPtr(tail);
        }        
    }//insertHead
    public void insertOrder(Pelicula p){
        Nodo newPtr=new Nodo();
        Nodo tempo=new Nodo();
        Nodo previous=new Nodo();
        newPtr.setPelicula(p);
        tempo=head;
        if(tempo==null){
            head=newPtr;
            tempo=head;
        }else{
            if(newPtr.getPelicula().getTitle().compareTo(head.getPelicula().getTitle())<0){
                newPtr.setNextPtr(head);
                newPtr.setPreviosPtr(tail);
                head=newPtr;
            }else{
                tempo=head;
                previous=head;
                while(newPtr.getPelicula().getTitle().compareTo(tempo.getPelicula().getTitle())>=0 && tempo.getNextPtr()!=null){
                    previous=tempo;
                    tempo=tempo.getNextPtr();
                }
                if(newPtr.getPelicula().getTitle().compareTo(tempo.getPelicula().getTitle())>0){
                    tempo.setNextPtr(newPtr);
                    tempo.setPreviosPtr(tail);
                }else{
                    newPtr.setNextPtr(tempo);
                    newPtr.setPreviosPtr(tail);
                    previous.setNextPtr(newPtr);
                }
            }
        }
        
    }//insertOrder
    public void printList(){
        temp=head;
        System.out.println(temp.getPelicula().toString());
        temp=temp.getNextPtr();
        while(temp!=head){
            System.out.println(temp.getPelicula().toString());
            temp=temp.getNextPtr();
        }
    }//print
//    public void insertIntoTail(Nodo newPtr){
//        if(head==null){
//            head=newPtr;
//            tail=head;
//        }else{
//            tail.setNextPtr(newPtr);
//            newPtr.setPreviosPtr(tail);
//            newPtr.setNextPtr(head);
//            head.setPreviosPtr(newPtr);
//            tail=newPtr;            
//        }
//    }//insertTail
//    public void upDate(Nodo ant,Nodo nuevo){
//        Nodo previoPtr;
//        temp=head;
//        if(head==ant){
//            head=nuevo;
//            head.setNextPtr(temp.getNextPtr());
//            temp.getNextPtr().setPreviosPtr(head);
//        }
//        while(temp!=null &&temp!=ant){
//            previoPtr=temp;
//            temp=temp.getNextPtr();
//        }
//        temp.getNextPtr().setPreviosPtr(nuevo);
//        nuevo.setNextPtr(temp.getNextPtr());
//    }//upDate
//    public void deleteToList(Nodo eliminado){
//        temp=head;
//        if(temp==null){
//            System.out.println("Lista vacia");
//        }
//        if(head==eliminado){
//            head.getPreviosPtr().setNextPtr(head.getNextPtr());
//            head.getNextPtr().setPreviosPtr(head.getPreviosPtr());
//            head=temp.getNextPtr();
//            temp=null;
//        }
//        while(temp!=null){
//            if(temp==eliminado){
//                temp.getPreviosPtr().setNextPtr(temp.getNextPtr());
//                temp.getNextPtr().setPreviosPtr(temp.getPreviosPtr());
//                temp=null;
//            }else{
//                temp=temp.getNextPtr();
//            }
//        }
//    }//delete
    
}//class
