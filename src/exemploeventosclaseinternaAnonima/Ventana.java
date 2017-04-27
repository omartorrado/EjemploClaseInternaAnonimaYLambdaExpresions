/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploeventosclaseinternaAnonima;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author otorradomiguez
 */
public class Ventana {
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
        
        /*Ejemplo de uso de clase interna anonima. Instanciamos la interfaz
        ActionListener y a continuacion deinimos los metodos, etc entre corchetes
        */
        botonV.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                panel.setBackground(Color.green);
            }
        });
        botonA.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                panel.setBackground(Color.yellow);
            }
        });
        /*Ejemplo lambda Expression de una clase interna anonima.
        En lugar de declarar un new ActionListener ponemos los parametros 
        seguidos de -> y entre corchetes definimos la clase
        */
        botonR.addActionListener((ActionEvent e) -> {
            panel.setBackground(Color.red);
        });
        /*
        En el caso de que el metodo solo tenga un parametro, no es necesario incluir
        el tipo de dato:
        botonR.addActionListener(e -> {
            panel.setBackground(Color.red);
        });
        */
        
        marco.setSize(800, 600);
        marco.setLocationRelativeTo(null);         
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
   
    
}
