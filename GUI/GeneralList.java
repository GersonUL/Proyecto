/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.MovieData;
import Domain.SeparateByLists;
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
public class GeneralList extends JInternalFrame implements ActionListener {

    private JTextArea jtaList;
    private JButton btnShow;
    private JScrollPane jsp;

    public GeneralList() {
        super();
        this.setLayout(new FlowLayout());
        this.setSize(780, 580);
        this.setClosable(true);
        this.setVisible(true);
        this.btnShow = new JButton("Show List");
        this.btnShow.addActionListener(this);
        this.add(btnShow);
        this.jtaList = new JTextArea(25, 55);
        this.jsp = new JScrollPane(jtaList);
        jtaList.setLineWrap(true);
        jtaList.setWrapStyleWord(true);
        this.add(jsp, BorderLayout.CENTER);
    }//const

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnShow) {
            MovieData md = new MovieData();
            SeparateByLists dividirPorListas = new SeparateByLists();
            jtaList.append(
                   "**Drama List** \n\n"+ dividirPorListas.getListDrama().printList() + "\n**Comedy List**\n\n"
                    + dividirPorListas.getListComedy().printList() + "\n**Childish List**\n\n"
                    + dividirPorListas.getListChildish().printList()+"\n**Action List**\n\n"
                    + dividirPorListas.getListAction().printList() + "\n**Romance List**\n\n"
                    + dividirPorListas.getListRomance().printList() + "\n**FictionList**\n\n"
                    + dividirPorListas.getListFiction().printList());
            btnShow.setEnabled(false);
        }
    }//action
}//class

