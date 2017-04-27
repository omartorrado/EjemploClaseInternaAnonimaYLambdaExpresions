/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploeventosclaseinterna;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout.Constraints;

/**
 *
 * @author otorradomiguez
 */
public class Ventana implements ActionListener {
    JFrame marco;
    JButton botonV, botonA, botonR;
    JPanel panel;
    
    public void mostrar(){
        marco = new JFrame();
        botonV = new JButton("verde");
        botonA = new JButton("amarillo");
        botonR = new JButton("rojo");
        panel = new JPanel();
                        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                
        panel.add(botonV);
        panel.add(botonA);
        panel.add(botonR);
        marco.add(panel);
        
        botonV.addActionListener(this);
        botonA.addActionListener(this);
        botonR.addActionListener(this);
        
        marco.setSize(800, 600);
        marco.setLocationRelativeTo(null);        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botonV){
            panel.setBackground(Color.green);
        }else if(e.getSource()==botonA){
            panel.setBackground(Color.yellow);
        }else if(e.getSource()==botonR){
            panel.setBackground(Color.red);
        }
    }
    
}
