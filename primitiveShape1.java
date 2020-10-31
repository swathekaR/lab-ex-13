/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author JESUS CHRIST
 */
public class primitiveShape1 extends Applet implements  ActionListener
{
   JRadioButton r1,r2,r3;
    ButtonGroup color;
    int a;

    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.BLUE);
        setForeground(Color.red);
        r1=new JRadioButton("oval");
        r2=new JRadioButton("square");
        r3=new JRadioButton("rectangle");
        add(r1);
        add(r2);
        add(r3);
        r1.addActionListener(this);
         r1.setBounds(50, 50, 100, 30);
        r2.addActionListener(this);
         r2.setBounds(50, 100, 100, 30);
        r3.addActionListener(this);
         r2.setBounds(50, 150, 100, 30);
        color=new ButtonGroup();
        color.add(r1);
        color.add(r2);
        color.add(r3);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        if(str=="oval")
        {
           a=1; 
        }
        if(str=="square")
        {
            a=2;
        }
        if(str=="rectangle")
        {
            a=3;
            
        }
        repaint();
        
    }
    
    public void paint(Graphics g)
{
   
        super.paint(g);
        if(a==1)
        {
            g.setColor(Color.BLACK);
            g.drawOval(100,250,100,100);
            
        }
        if(a==2)
        {
            g.setColor(Color.red);
            g.drawRect(200, 250,100, 100);
             
        }
        if(a==3)
        {
           g.setColor(Color.gray);
           g.drawRect(300,250,200,100); 
            
        }
       
        //<applet code="primitiveShape1" width=500 height=500>
 //</applet>
    }

class shape extends JFrame
{
    Container c;
    shape()
    {
        c=getContentPane();
        primitiveshape p=new primitiveshape();
        c.add(p);
    }
}
class radio
{
    public static void main(String[] args)
    {
        shape sh=new shape();
        sh.setTitle("PRIMITIVE SHAPE");
        sh.setSize(1000, 1000);
        sh.setVisible(true);
    }
}
        
        


    







