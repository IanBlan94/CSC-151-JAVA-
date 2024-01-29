/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle_test_blanchard_ian;
import javax.swing.JOptionPane;
/**
 *
 * @author blanchai4714
 */
public class Rectangle_Test_blanchard_Ian 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      String input; //To hold string input
      int length;   // To hold length
      int width;    // To hold Width
      int area;     // To hold area
      
      // Prompt the user to enter length
      input = JOptionPane.showInputDialog("Enter length:");
      
      //Convert the string input into an integer
      length = Integer.parseInt(input);
      
      //Prompt the user to enter width
      input = JOptionPane.showInputDialog("Enter width:");
      
      //Convert the string input into an integer
      width = Integer.parseInt(input);
      
      //Calculate the area using length and width
      area = length * width;
      
      // Display the area of the rectangle
      JOptionPane.showMessageDialog(null, "Area of rectangle is " + area);
              
              
    }
    
}
