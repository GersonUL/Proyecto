/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.MovieData;
import Domain.DividirPorListas;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author gerson
 */
public class CargarListaPorGenero extends JInternalFrame implements ActionListener, ItemListener {

    private JTextArea jtaLista;
    private JButton btnMostrar;
    private JScrollPane jsp;
    private JComboBox jcbOpcion;

    public CargarListaPorGenero() {
        super("Géneros");
        this.setLayout(new FlowLayout());
        this.setSize(780, 580);
        this.setClosable(true);
        this.setVisible(true);
        this.jcbOpcion = new JComboBox();
        this.jcbOpcion.addItem("");
        this.jcbOpcion.addItem("Drama");
        this.jcbOpcion.addItem("Comedy");
        this.jcbOpcion.addItem("Childish");
        this.jcbOpcion.addItem("Action");
        this.jcbOpcion.addItem("Romance");
        this.jcbOpcion.addItem("Fiction");
        this.jcbOpcion.addItemListener(this);
        this.add(jcbOpcion);
        this.jtaLista = new JTextArea(25, 55);
        this.jsp = new JScrollPane(jtaLista);
        jtaLista.setLineWrap(true);
        jtaLista.setWrapStyleWord(true);
        this.add(jsp, BorderLayout.CENTER);
    }//const

    @Override
    public void actionPerformed(ActionEvent e) {
        //if (e.get)
    }//action

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == jcbOpcion) {
            MovieData md = new MovieData();
            DividirPorListas dividirPorListas = new DividirPorListas();
            String opcion = (String) jcbOpcion.getSelectedItem();
            if (opcion.equalsIgnoreCase("Drama")) {
                jtaLista.setText("");
                jtaLista.append(dividirPorListas.getListDrama().printList());
            } else if (opcion.equalsIgnoreCase("Comedy")) {
                jtaLista.setText("");
                jtaLista.append(dividirPorListas.getListComedy().printList());
            } else if (opcion.equalsIgnoreCase("Childish")) {
                jtaLista.setText("");
                jtaLista.append(dividirPorListas.getListChildish().printList());
            } else if (opcion.equalsIgnoreCase("Action")) {
                jtaLista.setText("");
                jtaLista.append(dividirPorListas.getListAction().printList());
            } else if (opcion.equalsIgnoreCase("Romance")) {
                jtaLista.setText("");
                jtaLista.append(dividirPorListas.getListRomance().printList());
            } else if (opcion.equalsIgnoreCase("Fiction")) {
                jtaLista.setText("");
                jtaLista.append(dividirPorListas.getListFiction().printList());
            } else {
                jtaLista.setText("");
            }
        }
    }

}//class
