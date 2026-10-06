public class NestedLoop {
    public static void main(String[] args) {
        int i, j;
        
        for(i = 1; i <= 2; i++){ // 2 times it will print the inner loop.
            System.out.println("Outer Loop start");


            for(j = 1; j <= 3; j++){ // 3 times it will print the inner loop.
                System.out.println("*****HI");
            }
                
                System.out.println("Outer Loop end");

                //using post decrement can change the output structure of the loop.
                
            }
        }
    }

