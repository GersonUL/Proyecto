/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.MovieData;
import Domain.CircularList;
import Domain.Movie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author gerson
 */
public class Insert extends JInternalFrame implements ActionListener{
    private JTextField jtfCode,jtftitle,jtfgender,jtfsubtitled,jtfpremier,jtftotal;
    private JLabel lblCode,lblTitle,lblgender,lblsubtitled,lblpremier,lbltotal;
    private JButton btnInsert;
    public Insert(){
        super();    
        this.setLayout(null);
        this.setSize(300, 300);
        this.setClosable(true);
        init();
        this.setVisible(true);
    }
    private void init(){
        this.lblCode=new JLabel("CODE: ");
        this.lblCode.setBounds(10, 1, 100, 60);
        this.add(lblCode);
        
        this.jtfCode=new JTextField(10);
        this.jtfCode.setBounds(100,20 ,100 ,20 );
        this.add(jtfCode);
  
        this.lblTitle=new JLabel("TITLE: ");
        this.lblTitle.setBounds(10,43 ,100,40 );
        this.add(lblTitle);
        
        this.jtftitle=new JTextField(10);
        this.jtftitle.setBounds(100, 50, 100, 20);
        this.add(jtftitle);
        
        this.lblgender = new JLabel("GENDER: ");
        this.lblgender.setBounds(10, 70, 100, 40);
        this.add(lblgender);

        this.jtfgender = new JTextField(10);
         this.jtfgender.setBounds(100,80, 100 ,20 );
        this.add(jtfgender);

        this.lbltotal=new JLabel("TOTAL: ");
        this.lbltotal.setBounds(10,100,100,40);
        this.add(lbltotal);
        
        this.jtftotal=new JTextField(10);
        this.jtftotal.setBounds(100,110,100,20);
        this.add(jtftotal);
        
        this.lblsubtitled=new JLabel("SUBTITLED: ");
        this.lblsubtitled.setBounds(10,130,100,40);
        this.add(lblsubtitled);
        
        this.jtfsubtitled=new JTextField(10);
        this.jtfsubtitled.setBounds(100,140,100,20);
        this.add(jtfsubtitled);
        
         this.lblpremier=new JLabel("PREMIER: ");
         this.lblpremier.setBounds(10,160,100,40);
        this.add(lblpremier);
        
        this.jtfpremier=new JTextField(10);
        this.jtfpremier.setBounds(100,170,100,20);
        this.add(jtfpremier);
        
        
        this.btnInsert=new JButton("Save");
        btnInsert.addActionListener(this);
        this.btnInsert.setBounds(90,220,100,40);
        this.add(btnInsert);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnInsert){
            Movie p = new Movie(jtfCode.getText(),jtftitle.getText(),jtfgender.getText(),jtftotal.getText(),jtfsubtitled.getText(),jtfsubtitled.getText());
     
            MovieData md = new MovieData();
            md.readFile();
            md.insertFile(p);
            JOptionPane.showMessageDialog(null, "Saved");
        }
    }
}//class
