/* Name Surname: Nurettin Hakan SİNAL
 * ID: 220315099 
 */
package hw220315099;
import java.util.Scanner;
/**
 *
 * @author Hakan
 */
public class HW220315099 {

    public static void main(String[] args) {
    // Declare and create a weekly working hours array    
    int [][] workHours = createWorkersArray();
    
    // Display the two dimensional array
    System.out.println("The workers' weekly working hours are: ");
    displayArray(workHours);
    
    // Declare and create the average hours for each workers
    double [] averageHours = calculateAvg(workHours);
    // Display the average hours for each workers
    displayAvg(averageHours);
    
    // Display the Employee with the max average working time
    System.out.println("Employee with the max average working time: " + maxAvg(averageHours));
    
    // Finally, declare and create workers' salary
    double [] salary = createSalary(workHours);
    // Display the workers' salary
    displaySalary(salary);
    
    }

    public static int [][] createWorkersArray() {
    
    int [][] workHours = new int[10][7];
    
    for (int i=0; i<workHours.length; i++) {
    for (int j=0; j<workHours[i].length; j++) {
    workHours[i][j] = (int)(Math.random()*10);
    }
    }
        
    return workHours;
    }
    
    public static void displayArray(int [][] workHours) {
    
    System.out.println();
    System.out.println("               S M T W T F S");
    for (int i=0; i<workHours.length; i++) {
    System.out.print("Employee " + i + "     ");
    for (int j=0; j<workHours[i].length; j++) {
    System.out.print(workHours[i][j] + " ");
    }
    System.out.println();
    }        
    }
    
    public static double [] calculateAvg(int [][] workHours) {
    
    double [] averageHours = new double[10];
    double sum=0;
    double avg=0;
    
    for (int i=0; i<workHours.length; i++) {
    sum=0;
    avg=0;
    for (int j=0; j<workHours[i].length; j++) {
    sum += workHours[i][j];
    }
    avg = sum/7;
    averageHours[i] = avg;
    }
    
    return averageHours;
    }
    
    public static void displayAvg(double [] averageHours) {
    
    System.out.println();
    System.out.println("Average weekly working hours for each workers: ");
    System.out.println();
    for (int i=0; i<averageHours.length; i++) {
    System.out.print("Employee " + i + "     ");
    System.out.printf("%.2f",averageHours[i]);
    System.out.println();
    }
        
    }
    
    public static double maxAvg(double [] averageHours) {
    
    double max=0;
    System.out.println();
    for (int i=0; i<averageHours.length; i++) {
    if (averageHours[i]>max) {
    max=averageHours[i];
    }
    }
    
    return max;
    }
    
    public static double [] createSalary(int [][] workHours) {
    
    double [] salary = new double[10];
    int sum=0;
    
    for (int i=0; i<salary.length; i++) {
    salary[i]=2500;
    }
    
    for (int i=0; i<workHours.length; i++) {
    sum=0;
    for (int j=0; j<workHours[i].length; j++) {
    sum += workHours[i][j];
    if (sum > 35) {
    salary[i] += (sum-35)*(100);
    }
    }
    }
    
    return salary;
    }
 
    public static void displaySalary(double [] salary) {
    
    System.out.println();
    System.out.println("Workers' salary: ");
    System.out.println();
    
    for (int i=0; i<salary.length; i++) {
    System.out.print("Employee " + i + "     ");
    System.out.print(salary[i]);
    System.out.println();
    }
    System.out.println();
    }
    
}