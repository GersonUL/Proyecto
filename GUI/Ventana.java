/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author gerson
 */
public class Ventana extends JFrame implements ActionListener{
    private JMenuBar jmb;
    private JMenu jmMenu;
    private JMenuItem insertar;
    JDesktopPane jdp;
    public Ventana(){
        super("Menu principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,450);
        init();
    }
    private void init(){
    
        this.jmb=new JMenuBar();
        this.setJMenuBar(jmb);
        this.jmMenu=new JMenu("Menu");
        jmb.add(jmMenu);
        insertar=new JMenuItem("insertar");
        insertar.addActionListener(this);
        jmMenu.add(insertar);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==insertar){
            Ingresar i=new Ingresar();
            this.add(i);
            i.setVisible(true);
        }
    }
}//class
