/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Data.MovieData;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * @author Pablo Rojas Martínez
 */
public class Busqueda extends JInternalFrame implements ActionListener{
    
    private JTextField jtfNombre;
    private  JLabel lblNombre;
    private JButton jButtonBuscar;
    
    public Busqueda(){
        super();    
        this.setLayout(new FlowLayout());
        this.setSize(300, 300);
        this.setClosable(true);
        init();
        this.setVisible(true);
    }
    
    public void init(){
         this.lblNombre=new JLabel("Name: ");
        this.add(lblNombre);
        
        this.jtfNombre=new JTextField(10);
        this.add(jtfNombre);
        
        this.jButtonBuscar=new JButton("Search");
        jButtonBuscar.addActionListener(this);
        this.add(jButtonBuscar);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jButtonBuscar){
            JOptionPane.showMessageDialog(null,"Searching...");
            MovieData md = new MovieData();
            md.leerArchivo();
           JOptionPane.showMessageDialog(null,md.buscarPelicula(jtfNombre.getText()));
        }
    }
    
}
