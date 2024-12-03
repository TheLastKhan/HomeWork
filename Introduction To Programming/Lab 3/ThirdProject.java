/* Name Surname: NURETTİN HAKAN SİNAL Student ID: 220315099

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thirdproject;
import java.util.Scanner;
/**
 *
 * @author Hakan
 */
public class ThirdProject {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Q1 => Question 1");
        System.out.println("Q2 => Question 2");
        System.out.println("Please write the code of the question: Q1 or Q2 ");

        Scanner input = new Scanner(System.in);
        
        String inputQuest = input.nextLine().toUpperCase();
        
        if(!inputQuest.equals("Q1") && !inputQuest.equals("Q2")) 
        {
        System.out.println("Sorry, incorrect input.");
        System.exit(1);
        }

        //Q1
        if(inputQuest.equals("Q1"))
        {
        System.out.println("Enter your weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.println("Enter your height in inches: ");
        double inches = input.nextDouble();
        
        double kg = pounds * 0.45359237;
        double meters = inches * 0.0254;

        double bmiDouble = (kg/(Math.pow(meters,2)));
        int bmiInt = (int)bmiDouble;

        System.out.println("Your BMI is: " + bmiInt);

        if (bmiInt < 18.5)
            System.out.println("Underweight");
        else if (bmiInt >= 18.5 && bmiInt < 25.0)
            System.out.println("Normal");
        else if (bmiInt >= 25.0 && bmiInt <30.0)
            System.out.println("Overweight");
        else if (bmiInt >= 30.0)
            System.out.println("Obese");
        else
            System.out.println("Error");

        System.out.println();
        }
        
        //Q2
        else if(inputQuest.equals("Q2"))
        {

        System.out.println("""
                           Choose operation:
                           1 for addition
                           2 for substraction
                           3 for multiplying
                           4 for dividing""");

        int operation = input.nextInt();

        System.out.println("enter two numbers");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        if (operation == 1)
            System.out.println("result = " + (int)(number1 + number2));
        else if (operation == 2)
            System.out.println("result = " + (int)(number1 - number2));
        else if (operation == 3)
            System.out.println("result = " + (int)(number1 * number2));
        else if (operation == 4)
            System.out.println("result = " + (double)(number1 / number2));
        else
            System.out.println("Error");

        }
    }
}