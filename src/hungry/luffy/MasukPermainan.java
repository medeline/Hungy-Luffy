/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungry.luffy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer; //merupakan librari java untuk mengaktifkan Timer

/**
 *
 * @author user1
 */
public class MasukPermainan extends JPanel implements ActionListener, KeyListener {
    private ArrayList<Makanan> makanan;
    Timer tm = new Timer(5,this); //Timer merupakan librari java untuk animasi, this di sini menunjuk ke ActionListener
    int x=300, y= 460, velX=0, velY=0;
    Image background  = new ImageIcon("src\\TampilanGame\\background2.png").getImage();
    Image pemain = new ImageIcon("src\\TampilanGame\\kepala_luffy_oye.png").getImage();
    //x adlah variabel untuk mengatur posisi persegi secara horizontal, kita set dengan 0 karena kita mengatur letak objek di paling kiri
    //y adlah variabel untuk mengatur posisi persegi secara vertikal, kita set dengan 0 karena kita mengatur letak objek di paling atas
    //velX adlah variabel untuk mengatur kecepatan objek secara horizontal, kita set dengan 0 karena untuk awal kita mengatur objeknya tidak bergerak
    //velY adlah variabel untuk mengatur kecepatan objek secara vertikal, kita set dengan 0 karena untuk awal kita mengatur objeknya tidak bergerak
    
    public MasukPermainan(){
        tm.start(); //untuk memulai proses animasi user yang nantinya akan diarahkan dengan keyboard
//        addKeyListener(this); //agar kita dapat menggunakan keyListener dalam program, "this" menunjuk keylistener yang diimplements
//        setFocusable(true);
//        setTraversalKeyEnable(false);//digunakan agar keyboard shift dan key tidk dapat digunakan
     
        
        
    }
    
    public void paintComponent(Graphics g){
        //digunkan utk membuat objek
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g; //untuk background
	g2d.drawImage(background,0,0,null); 
        g.drawImage(pemain, x, y, this);
//        g.fillRect(x,y,70,70); //untuk ukurannya
        
      
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) { //untuk mengatur aksi dari objek
        if(x<0){
            velX = 0;
            x = 0;
        }
        if(x>550){
            velX = 0;
            x = 550;
        }
        
//        if(y<0){
//            velY = 0;
//            y = 0;
//        }
//
//        if(y>530){
//            velY = 0;
//            x = 530;
//        }
        
        x = x+velX;
        y = y+velY;
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) { //untuk compile program
    }

    @Override
    public void keyPressed(KeyEvent e) { //untuk mengatur mau pake keyboard yg mana untuk gerak objek
        int c = e.getKeyCode();
        if(c == KeyEvent.VK_LEFT){
            velX = -5;
            velY = 0;
        }
//        if(c == KeyEvent.VK_UP){
//            velX = 0;
//            velY = -1;
//        }
        if(c == KeyEvent.VK_RIGHT){
            velX = 5;
            velY = 0;
        }
//        if(c == KeyEvent.VK_DOWN){
//            velX = 0;
//            velY = 1;
//        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
         velX = 0;
         velY = 0;
    }

}
