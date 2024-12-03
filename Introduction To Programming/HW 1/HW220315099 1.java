/* Name: NURETTİN HAKAN
 * Surname: SİNAL 
 * Student ID: 220315099
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw220315099;
import java.util.Scanner;
/**
 *
 * @author Hakan
 */
public class HW220315099 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the number of questions you answered correctly in the midterm: [0 - 5]");
        int midterm = input.nextInt();
        int midtermTrue = midterm * 20;
        if (midterm >5 || midterm < 0){
            System.out.println("You entered the number: " + midterm);
            System.out.println("Please enter a number between 0 and 5");
            System.exit(1);
        }
        
        System.out.println("Please enter the number of questions you answered correctly in the quiz: [0 - 20]");
        int quiz = input.nextInt();
        int quizTrue = quiz * 5;
        if (quiz >20 || quiz < 0){
            System.out.println("You entered the number: " + quiz);
            System.out.println("Please enter a number between 0 and 20");
            System.exit(1);
        }
        
        System.out.println("Please enter the final exam grade: [0 - 100]");
        int _final = input.nextInt();
        if (_final > 100 || _final < 0){
            System.out.println("You entered the number: " + _final);
            System.out.println("Please enter a number between 0 and 100");
            System.exit(1);
        }
        
        int classPerformance = (int)(Math.random()*100)+1;
        System.out.println("Your class performance grade is (Out of 100): " + classPerformance);
        
        double midtermFinal = (double)midtermTrue*25/100;
        double quizFinal = (double)quizTrue*15/100;
        double _finalFinal = (double)_final*50/100;
        double classPerformanceFinal = (double)classPerformance*10/100;
        
        double overallGrade = (midtermFinal + quizFinal + _finalFinal + classPerformanceFinal);
        System.out.println("Your overall grade is: " + overallGrade);
        
        char a = 'A' , b = 'B' , c = 'C' , d = 'D' , f = 'F';
        
        System.out.println();
        System.out.println("***** Your Result *****");
        if (overallGrade >= 90)
            System.out.println("Your midterm is: " + midtermFinal + "\n" + "Your quiz is: " + quizFinal + "\n" + "Your final is: " + _finalFinal + "\n" + "Your class performance grade is: " + classPerformanceFinal + "\n" + "Your overall grade is: " + overallGrade + "\n" + "Your letter grade is: " + a + "\n" + "Description: Successful");
        else if (overallGrade >= 80)
            System.out.println("Your midterm is: " + midtermFinal + "\n" + "Your quiz is: " + quizFinal + "\n" + "Your final is: " + _finalFinal + "\n" + "Your class performance grade is: " + classPerformanceFinal + "\n" + "Your overall grade is: " + overallGrade + "\n" + "Your letter grade is: " + b + "\n" + "Description: Successful");
        else if (overallGrade >= 65)
            System.out.println("Your midterm is: " + midtermFinal + "\n" + "Your quiz is: " + quizFinal + "\n" + "Your final is: " + _finalFinal + "\n" + "Your class performance grade is: " + classPerformanceFinal + "\n" + "Your overall grade is: " + overallGrade + "\n" + "Your letter grade is: " + c + "\n" + "Description: Successful");
        else if (overallGrade >= 50)
            System.out.println("Your midterm is: " + midtermFinal + "\n" + "Your quiz is: " + quizFinal + "\n" + "Your final is: " + _finalFinal + "\n" + "Your class performance grade is: " + classPerformanceFinal + "\n" + "Your overall grade is: " + overallGrade + "\n" + "Your letter grade is: " + d + "\n" + "Description: Conditional Pass");
        else if (overallGrade < 50)
            System.out.println("Your midterm is: " + midtermFinal + "\n" + "Your quiz is: " + quizFinal + "\n" + "Your final is: " + _finalFinal + "\n" + "Your class performance grade is: " + classPerformanceFinal + "\n" + "Your overall grade is: " + overallGrade + "\n" + "Your letter grade is: " + f + "\n" + "Description: Fail");
        else
            System.out.println("Error");
    }
    
}