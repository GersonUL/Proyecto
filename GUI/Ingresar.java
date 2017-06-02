/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author gerson
 */
public class Ingresar extends JInternalFrame implements ActionListener{
    private JTextField jtfCode,jtftitle,jtfgender,jtfsubtitled,jtfpremier,jtftotal;
    private JLabel lblCode,lblTitle,lblgender,lblsubtitled,lblpremier,lbltotal;
    private JButton btnInsertar;
    public Ingresar(){
        super();    
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(50, 50));
        this.setClosable(true);
        init();
        this.setVisible(true);
    }
    private void init(){
        this.lblCode=new JLabel("CODE: ");
        this.add(lblCode);
        this.jtfCode=new JTextField(10);
        this.add(jtfCode);
        
        this.lblTitle=new JLabel("TITLE: ");
        this.add(lblTitle);
        this.jtftitle=new JTextField(10);
        this.add(jtftitle);
        
        this.lblgender=new JLabel("GENDER: ");
        this.add(lblgender);
        this.jtfgender=new JTextField(10);
        this.add(jtfgender);
        
        this.lblpremier=new JLabel("PREMIER: ");
        this.add(lblpremier);
        this.jtfpremier=new JTextField(10);
        this.add(jtfpremier);
        
        this.lblsubtitled=new JLabel("SUBTITLED: ");
        this.add(lblsubtitled);
        this.jtfsubtitled=new JTextField(10);
        this.add(jtfsubtitled);
        
        this.lbltotal=new JLabel("TOTAL: ");
        this.add(lbltotal);
        this.jtftotal=new JTextField(10);
        this.add(jtftotal);
        
        this.btnInsertar=new JButton("insertar");
        btnInsertar.addActionListener(this);
        this.add(btnInsertar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnInsertar){
            JOptionPane.showMessageDialog(null, "Insertado");
        }
    }
}//class
