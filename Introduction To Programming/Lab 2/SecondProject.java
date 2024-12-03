/* Name Surname: NURETTİN HAKAN SİNAL Student ID: 220315099

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondproject;
import java.util.Scanner;
/**
 *
 * @author Hakan
 */
public class SecondProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
                
        System.out.println("Enter your weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.println("Enter your height in inches: ");
        double inches = input.nextDouble();
        
        double kg = pounds * 0.45359237;
        double meters = inches * 0.0254;
        
        double bmiDouble = (kg/(Math.pow(meters,2)));
        int bmiInt = (int)bmiDouble;
        
        System.out.println("Your BMI is: " + bmiInt);
        
    }
    
}