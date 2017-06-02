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
public class Nodo {
    private Nodo nextPtr, previosPtr;
    
    public Nodo(){
        this.nextPtr=null;
        this.previosPtr=null;
    }//const
    public Nodo(Nodo next,Nodo prev){
        this.nextPtr=next;
        this.previosPtr=prev;
    }//const

    public Nodo getNextPtr() {
        return nextPtr;
    }

    public void setNextPtr(Nodo nextPtr) {
        this.nextPtr = nextPtr;
    }

    public Nodo getPreviosPtr() {
        return previosPtr;
    }

    public void setPreviosPtr(Nodo previosPtr) {
        this.previosPtr = previosPtr;
    }

    
}//class
