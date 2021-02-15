/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungry.luffy;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainGame extends JPanel {
    ArrayList <Integer> deret= new ArrayList<>();
    Image layar = new ImageIcon("src\\TampilanGame\\background.jpg").getImage();
    Image makanan     = new ImageIcon("src\\TampilanGame\\daging.png").getImage();
    Image luffy     = new ImageIcon("src\\TampilanGame\\kepala_luffy.png").getImage();

    int x_luffy,y_luffy;
    int x_makanan,y_makanan;
    Random rand = new Random(); 
    
    int pointsCount = 0;
    
    MainGame(){
		
		setLayout(null);
		setFocusable(true); 
                setSize(800, 600);
               
                
		x_luffy = 450; y_luffy = 600;
		x_makanan = (int)rand.nextInt(1000);
		y_makanan = 0;
		
	    
                JLabel points = new JLabel("Points: 0");
		points.setBounds(100,10,100,20);
		
		add(points);
                
                
                
    }
			
}//end paintComponent

*/
public class MainGame extends JFrame{
    public MainGame(){
        createFlowLayout(); //digunakan untuk membuat layout atau frame
    } 
    private Image background;
//    private void createInterface(){
//        this.setTitle("Border1");
//        this.setSize(600,600);
//        this.setLocation(200,200);
//        this.setLayout(new BorderLayout());
//        this.add(new JButton ("North"),BorderLayout.NORTH);
//        this.add(new JButton ("South"),BorderLayout.SOUTH);
//        this.add(new JButton ("East"),BorderLayout.EAST);
//        this.add(new JButton ("Center"),BorderLayout.CENTER);
//        this.setVisible(true);
//    }
        public void createFlowLayout(){
        JPanel panel = new JPanel();
 
        this.add(panel);
        this.setTitle("Flow");
        this.setSize(675,600);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[]args){
        MainGame g = new MainGame();
        
        
    }

    private void setDefaultCloseOption(int EXIT_ON_CLOSE) {
   
    }

    private void setLocation(MainGame aThis) {
 
    }



}

   