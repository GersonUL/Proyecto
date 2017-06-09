/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.MovieData;
import Domain.DividirPorListas;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author gerson
 */
public class ListaGeneral extends JInternalFrame implements ActionListener {

    private JTextArea jtaLista;
    private JButton btnMostrar;
    private JScrollPane jsp;

    public ListaGeneral() {
        super();
        this.setLayout(new FlowLayout());
        this.setSize(780, 580);
        this.setClosable(true);
        this.setVisible(true);
        this.btnMostrar = new JButton("Mostrar");
        this.btnMostrar.addActionListener(this);
        this.add(btnMostrar);
        this.jtaLista = new JTextArea(25, 55);
        this.jsp = new JScrollPane(jtaLista);
        jtaLista.setLineWrap(true);
        jtaLista.setWrapStyleWord(true);
        this.add(jsp, BorderLayout.CENTER);
    }//const

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {
            MovieData md = new MovieData();
            DividirPorListas dividirPorListas = new DividirPorListas();
            jtaLista.append("Drama List\n"+dividirPorListas.getListDrama().printList()+"Comedy List\n"+dividirPorListas.getListComedy().printList()+
                    "Childish List\n"+dividirPorListas.getListChildish().printList()+"ActionList\n"+dividirPorListas.getListAction().printList()+
                    "Romance List\n"+dividirPorListas.getListRomance().printList()+"Fiction List\n"+dividirPorListas.getListFiction().printList());
            btnMostrar.setEnabled(false);
        }
    }//action
}//class