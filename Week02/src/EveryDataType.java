public class EveryDataType {
    public static void main(String[] args) {
        // lets do avg using float 
    
   int a, b, c;
   a = 10;
   b =-5;
   c = 20; 
   // lets sum them up
   int sum;
   sum = a + b + c;
   System.out.println("Sum of a, b, c is: " + sum);
   float avg;
   avg = (a + b + c) / 3;
   System.out.println("Average of a, b, c  is: " + avg);
   // result came 8.0 but what if we typecast?
    avg = (float)(a + b + c) / 3;
    System.out.println("Average of a, b, c  is: " + avg);
    // if we use long it can hold bigger value than int
    long e, f, g;
    e = 10245;
    f = 10000;
    g = 23056;
    avg = (float)(e + f + g) / 3;
    System.out.println("average of a, b, c  is: " + avg);
    // lets use boolean
    boolean x;

x = true;
    System.out.println("Boolean value of x is: " + x);
    // now char
    char y;
    y = 'A';
    System.out.println("Character value of y is: " + y);
        }
    }
