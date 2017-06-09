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
public class Ventana extends JFrame implements ActionListener {

    private JMenuBar jmb;
    private JMenu jmMenu;
    private JMenuItem insertar, buscar, listaGeneral, listaPorGenero;
    JDesktopPane jDesktopPane;

    public Ventana() {
        super("Menu principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        init();
    }

    private void init() {

        this.jmb = new JMenuBar();
        this.setJMenuBar(jmb);
        this.jmMenu = new JMenu("Menu");
        jmb.add(jmMenu);

        insertar = new JMenuItem("Insertar");
        insertar.addActionListener(this);
        jmMenu.add(insertar);

        buscar = new JMenuItem("Buscar");
        buscar.addActionListener(this);
        jmMenu.add(buscar);

        listaGeneral = new JMenuItem("Lista General");
        listaGeneral.addActionListener(this);
        jmMenu.add(listaGeneral);

        listaPorGenero = new JMenuItem("Lista Generos");
        listaPorGenero.addActionListener(this);
        jmMenu.add(listaPorGenero);

        jDesktopPane = new JDesktopPane();
        this.add(this.jDesktopPane);
        jDesktopPane.setVisible(true);
        this.setResizable(true);
    }//init

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == listaGeneral) {
            ListaGeneral lg = new ListaGeneral();
            this.jDesktopPane.add(lg);
            // lg.setVisible(true);
        } else if (e.getSource() == buscar) {
            Busqueda b = new Busqueda();
            this.jDesktopPane.add(b);
            // b.setVisible(true);
        } else if (e.getSource() == insertar) {
            Ingresar i = new Ingresar();
            this.jDesktopPane.add(i);
            // i.setVisible(true);
        } else if (e.getSource() == listaPorGenero) {
            CargarListaPorGenero clpg = new CargarListaPorGenero();
            this.jDesktopPane.add(clpg);
        }
    }
}//class
