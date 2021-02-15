/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungry.luffy;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author user1
 */
public class Makanan {
    private int x;
    private int y;
    Makanan(int x,int y) {
        this.x = x;
        this.y = y;
    }
    
    public void tick(){
        y += 1;
    
    }
    
    public void render(Graphics g){
        g.setColor(Color.black);
        g.fillOval(x, y, 25, 25);
    
    }
    
}
