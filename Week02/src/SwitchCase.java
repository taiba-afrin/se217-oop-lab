public class SwitchCase {
    public static void main(String[] args) {
        int x = 1; // if u keep changing the value of x it will print different output.
        switch(x){
            case 1:
                System.out.println("Bangladesh");
                break; // if  we dont use break it will print all the cases after the case 1.
            case 2:
                System.out.println("USA");
                break;
            default:
                System.out.println("Out Of Earth");
                
        }
    }
}
// only constant values are allowed in switch case statement.
// duplicate case values are not allowed in switch case statement.