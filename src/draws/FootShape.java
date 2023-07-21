/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package draws;

import java.util.Scanner;

/**
 *
 * @author ntpsm
 */

public class FootShape { 
    private Foots foots;
  public void drawAsEllipse(){
      foots = new Ellipse();
  }
  public void drawAsRectangle(){
      foots = new Rectangle();
  }
    public String Draws() {
        return foots.draw();
    }
  public static void main(String[] args){
      FootShape FootShape = new FootShape() {};
      Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                FootShape.drawAsEllipse();
                break;
            case 2:
                FootShape.drawAsEllipse();
                break;
           
        }
        System.out.println(FootShape.Draws());   
      
  }
  
}
