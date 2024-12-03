/* Name Surname = Nurettin Hakan SİNAL
 * ID = 220315099
 *
 *
 */
package lab5_220315099;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Hakan
 */
public class Lab5_220315099 {

        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int operation;      
        
        do {        
            System.out.println("which operation do you want to do?");
            System.out.println("1- Write all even numbers between an interval");
            System.out.println("2- Generate and printout a random matrice");
            System.out.println("3- Generate a password and printout");
            System.out.println("0- for exit");                     
            operation = sc.nextInt();
            selectOperation(operation);
            System.out.println();
        } while (operation != 0);
        System.out.println("bye bye");
        
    }
    
    public static void selectOperation(int n){
        
        Scanner sc = new Scanner(System.in);
        
        switch (n) {
            case 1:
                {
                    System.out.println("write two integers as boundaries");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    printEvenNumbers(a, b);
                    break;
                }
            case 2:
                {
                    System.out.println("write two integers as matrice size");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    printRandomMatrice(a, b);
                    break;
                }
            case 3:
                {
                    System.out.println("how much length password should be");
                    int a = sc.nextInt();
                    String generatedPassword = generatePassword(a);
                    System.out.println("password: " + generatedPassword);
                    break;
                }
            default:
                break;
        }
    }
 
    public static void printEvenNumbers(int x, int y) {
    int i=0;
    for (i = x + 1; i < y; i++) {
    if (i % 2 == 0) {
        System.out.print(i);
        System.out.print(" ");
    }
    }
    }
    
    public static void printRandomMatrice (int x, int y) {
    int i=0 , j=0;
    for (i = 0; i < x; i++) {
    for (j = 0; j < y; j++) {
    int rn = (int)(Math.random()*10);
        System.out.print(rn);
        System.out.print(" ");
    }
    System.out.println();
    }
    }
    
    public static String generatePassword(int x) {
    String generatedPassword = "";
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";    
    int i=0;
    Random r = new Random();

    for (i = 0; i <= x - 1; i++) {
    generatedPassword += characters.charAt(r.nextInt(characters.length()-1));    
    }
        
        //System.out.println();
    return generatedPassword;
    }
}
