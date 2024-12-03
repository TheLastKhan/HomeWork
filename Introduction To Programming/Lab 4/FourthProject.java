/* Name Surname: NURETTİN HAKAN SİNAL Student ID: 220315099
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fourthproject;

/**
 *
 * @author Hakan
 */
public class FourthProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1 = "123";
        String s2 = "abc";
        
        System.out.println("Before swap: ");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        
        System.out.println();
        
        System.out.println("After swap: ");
        s1 = s1 + s2;
        
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        
    }
    
}