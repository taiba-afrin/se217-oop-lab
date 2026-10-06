public class Ifelse {
    public static void main(String[] args) {
        int x = 20;
       if(x % 2 == 0 && x  % 5 ==0){
        System.out.println("Hi");

        // trying OR 
        if(x % 2 == 0 || x  % 5 ==0){
        System.out.println("Hi");
        
        // if else
            int a  = 2;
        if( a > 5 && a < 10){
            System.out.println("6-10");
        }else {
            System.out.println("Condition False. ");
            // ODD Or EVEN 
            int num = 40;
            if(num % 2 == 0){
                System.out.println("Even Number");
            }else{
                System.out.println("Odd Number");
                
            }

        }
        }
    }
}
}