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
public class Window extends JFrame implements ActionListener {

    private JMenuBar jmb;
    private JMenu jmMenu;
    private JMenuItem insert,search,generalList,listByGender;
    JDesktopPane jDesktopPane;

    public Window() {
        super("Principal Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        init();
    }

    private void init() {

        this.jmb = new JMenuBar();
        this.setJMenuBar(jmb);
        this.jmMenu = new JMenu("Menu");
        jmb.add(jmMenu);
        
        
        insert = new JMenuItem("Insert Movie");
        insert.addActionListener(this);
        jmMenu.add(insert);
        
        search = new JMenuItem("Search Movie");
        search.addActionListener(this);
        jmMenu.add(search);
        
        generalList = new JMenuItem("General List");
        generalList.addActionListener(this);
        jmMenu.add(generalList);
        
        listByGender = new JMenuItem("List of Genres");
        listByGender.addActionListener(this);
        jmMenu.add(listByGender);
        
        jDesktopPane = new JDesktopPane();
        this.add(this.jDesktopPane);
        jDesktopPane.setVisible(true);
          this.setResizable(true);
    }//init

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generalList) {
            GeneralList lg = new GeneralList();
            this.jDesktopPane.add(lg);
           // lg.setVisible(true);
        }
        else if(e.getSource()==search){
            Search b = new Search();
            this.jDesktopPane.add(b);
           // b.setVisible(true);
        }
        else if(e.getSource()==insert){
            Insert i = new Insert();
            this.jDesktopPane.add(i);
           // i.setVisible(true);
        }
        else if(e.getSource()==listByGender){
            UploadByGender clpg = new UploadByGender();
            this.jDesktopPane.add(clpg);
        }
    }
}//class
