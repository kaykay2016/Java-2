
// Kayleen Mercer  Assignment 5A
// 3/28/2017
// CS 121 Spring 2017
// The purpose of this assignment is to determine temperature


package assignment5a;

import javax.swing.JOptionPane;


public class Assignment5A {

  
    public static void main(String[] args) {
    
   
    int num = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for conversion to Fahrenheit, 2 for conversion to Celsius or 3 to quit.")); //prompt
    
    do
   
   {
        
    switch (num)
   
    {   
    
    case 1: // if user indicates 1
   
    double tempC = Double.parseDouble(JOptionPane.showInputDialog("Enter a positive Celsius temperature")); // prompt
    
    do
    {
     
        if (tempC < 0) // if Celsius temperature is less than 0
     
        {
         
         JOptionPane.showMessageDialog(null, "You have entered an invalid number, please try again"); // prompt
       
         tempC = Double.parseDouble(JOptionPane.showInputDialog("Enter a positive Celsius temperature")); // prompt
     
        }
    
    } while ( tempC < 0); // while Celisus temperature is less than 0
    
    String message = String.format("The temperature from Celsius to Fahrenheit is %.2f", fahrenheit(tempC)); // display product
    JOptionPane.showMessageDialog(null, message);
    
    
    num = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for conversion to Fahrenheit, 2 for conversion to Celsius or 3 to quit.")); // prompt
    
    }
    
    switch (num)
    
    {
       
    case 2: // if user indicates 2
    
    double tempF = Double.parseDouble(JOptionPane.showInputDialog("Enter a positive Fahrenheit temperature")); // prompt

    do
    {
       if (tempF < 0) // if Fahrenheit temperature is less than 0
       
       {
     
           JOptionPane.showMessageDialog(null, "You have entered an invalid number, please try again"); // prompt
      
           tempF = Double.parseDouble(JOptionPane.showInputDialog("Enter a positive Fahrenheit temperature")); // prompt
      
       } 
    
    } while (tempF < 0); // while Fahrenheit temperature is less than 0
    
    String message1 = String.format("The temperature from Fahreheit to Celsius is %.2f", celsius(tempF)); // display product
    JOptionPane.showMessageDialog(null, message1);

    num = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for conversion to Fahrenheit, 2 for conversion to Celsius or 3 to quit.")); // prompt
    
    }
    
    do
    {
    
        if (num < 1)
    {
      
      JOptionPane.showMessageDialog(null, "You have entered an invalid number, please try again"); // prompt
        
      num = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for conversion to Fahrenheit, 2 for conversion to Celsius or 3 to quit")); //prompt
  
    }
       if (num > 3)
    {
           
       JOptionPane.showMessageDialog(null, "You have entered an invalid number, please try again"); // prompt
        
       num = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for conversion to Fahrenheit, 2 for conversion to Celsius or 3 to quit.")); //prompt
      
    }
    
    
    } while (num < 1 || num > 3); // while number is less than 1 or greater than 3
    
    switch (num)
    
    {
        case 3: // if user indicates 3
        
        JOptionPane.showMessageDialog(null, "You have quit the program, have a nice day!"); // prompt
     
    }
    
   } while (num <= 2); // while number is less than or equal to 2
          
    }
     
    public static double fahrenheit (double celsius) // method
     {
     
      return ((double)(9.0/5.0 * celsius + 32)); // calculation
     
     }
    
    public static double celsius (double fahrenheit) // method
    {
    
     return ((double)(5.0/9.0 * (fahrenheit - 32))); // calculation
   
    } // end main method

} // end class comparison