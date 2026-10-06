public class splits {
    public static void main(String[] args) {
        String s = "I@LOVE@BANGLADESH";
        String [] a = s.split("@");
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // we can use \\s to create more space between these string
        
        
    }
}
