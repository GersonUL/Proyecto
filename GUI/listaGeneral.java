/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.MovieData;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author gerson
 */
public class listaGeneral extends JInternalFrame implements ActionListener{
    private JTextArea jtaLista;
    private JButton btnMostrar;
    private JScrollPane jsp;
    
    
    public listaGeneral(){
        super();    
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(50, 50));
        this.setClosable(true);
        this.setVisible(true);
        this.btnMostrar=new JButton("Mostrar");
        this.btnMostrar.addActionListener(this);
        this.add(btnMostrar);
        this.jtaLista=new JTextArea(25,55);      
        this.jsp=new JScrollPane(jtaLista);
        jtaLista.setLineWrap(true);
        jtaLista.setWrapStyleWord(true);
        this.add(jsp,BorderLayout.CENTER );
        
    }//const

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnMostrar){
            MovieData md=new MovieData();
            jtaLista.append(md.leerArchivo()+"");
            btnMostrar.setEnabled(false);
        }
    }//action
}//class
