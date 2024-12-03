/* Name Surname = Nurettin Hakan SİNAL
 * ID = 220315099
 */
package lab6_220315099;
import java.util.Scanner;

/**
 *
 * @author Hakan
 */
public class Lab6_220315099 {

    public static void main(String[] args) {
    question1();
    question2();
    }
    
    public static void question1(){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the array size: ");
    int arraySize = input.nextInt();
    int [] myArray = new int [arraySize];
    int [] myFreq = new int [arraySize];
    
    for (int i = 0; i < arraySize; i++) {
    int randomNumber = (int)(Math.random()*arraySize);
    myArray[i] = randomNumber;
    myFreq[myArray[i]]++;    
    }
    
        System.out.println("Array: ");
    for (int i = 0; i < arraySize; i++) {
        System.out.print(myArray[i] + " ");
    }
    
        System.out.println();
    
        System.out.println("Frequency of the Array: ");
    for (int i = 0; i < arraySize; i++) {
        System.out.print(myFreq[i] + " ");
    }
    
        System.out.println();
        System.out.println();

    }
    
    public static void question2(){
    
    int [] idArray = {100315086, 100315002, 100315079};
    String [] nameArray = {"ali", "ayse", "zeki"};
        
    for (int i = 0; i < idArray.length; i++)   
    {  
    for (int j = i + 1; j < idArray.length; j++)   
    {  
    int tmp1 = 0;
    String tmp2 = "";
    if (idArray[i] > idArray[j])   
    {  
    tmp1 = idArray[i];
    tmp2 = nameArray[i];
    idArray[i] = idArray[j];  
    nameArray[i] = nameArray[j];
    idArray[j] = tmp1;
    nameArray[j] = tmp2;
    }  
    }  
    }  
    
    for (int i = 0; i < idArray.length; i++) {
        System.out.print(idArray[i] + " "); }
    
        System.out.println();
        
    for (int i = 0; i < idArray.length; i++) {
        System.out.print(nameArray[i] + "         "); }
    
    }
}