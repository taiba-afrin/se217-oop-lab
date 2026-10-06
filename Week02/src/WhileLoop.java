public class WhileLoop {
    public static void main(String[] args) {
        int x = 3;
        while(x <= 5) {
System.out.println("Let me go !");
x++; // if we change the value of x to 6 then it will not print anything because the condition is false.
// infinite loop
// if we remove the x++ then it will print "Let me go !" infinitely because the condition is always true.
int sum = 0;
int i = 5;
while(i <= 100) {
    sum = sum + i;
    i = i + 5;
    System.out.println("Sum of  is: " + sum);
    // we didnt use break thats why it printed the sum line and let me go line one after one

        }

    }
}
}
