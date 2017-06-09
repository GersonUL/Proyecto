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
public class Search extends JInternalFrame implements ActionListener{
    
    private JTextField jtfName;
    private  JLabel lblName;
    private JButton jButtonSearch;
    
    public Search(){
        super();    
        this.setLayout(new FlowLayout());
        this.setSize(300, 300);
        this.setClosable(true);
        init();
        this.setVisible(true);
    }
    
    public void init(){
         this.lblName=new JLabel("Name: ");
        this.add(lblName);
        
        this.jtfName=new JTextField(10);
        this.add(jtfName);
        
        this.jButtonSearch=new JButton("Search");
        jButtonSearch.addActionListener(this);
        this.add(jButtonSearch);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jButtonSearch){
            JOptionPane.showMessageDialog(null,"Searching...");
            MovieData md = new MovieData();
            md.readFile();
           JOptionPane.showMessageDialog(null,md.searchMovies(jtfName.getText()));
        }
    }
    
}
