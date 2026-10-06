public class Array {
    public static void main(String[] args) {
        int a[] = new int [3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        int x = a[0] + a[2];
        System.out.println(x);

        a[2] = 100;
        x = a[0] +  a[2];
        System.out.println(x);
        // now lets find the length of the array
        int X[] = {1, 3, -44, 4, 5};
        System.out.println("Length of the array is: " + X.length);
        System.out.println("Value of index 0: " + X[0]);
        System.out.println("Value of index 1: " + X[1]);

        // lets use string array
        char arr[] = {'h', 'i'};
        System.out.println(arr);
         


        // lets use 2d array
        int Arr[][] = {{10, 20, 30},
                          {40, 50, 60}};
                          for(int i = 0; i < 2; i++){ // for rows
                            for(int j = 0; j < 3; j++){ // for columns
                                System.out.println(Arr[i][j]);
                            }
                            System.out.println(); // for new line after each row
                            }

    }

        }
    
