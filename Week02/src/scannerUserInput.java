
 import java.util.Scanner;
public class scannerUserInput {
   

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x;
System.out.println("Enter the value of X: ");
x = sc.nextInt();
System.out.println("x = " + x);
sc.close();
}  


// if we use long we've to change thats nextInt to nextLong,nextDouble for using double 
// and to print a new line nextLine is usable 

}
