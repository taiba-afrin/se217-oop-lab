public class stringDemo
 {
    public static void main(String[] args) {

        //char st[] = {'h', 'i'};
        String st = "hi, i'am Good.";
        String s2 = new String("Bangladesh");

System.out.println(st + " " + s2);

// length of the string
String s3 = "DHAKA";
int length = s3.length();
System.out.println("Length of the string 3 is: " + length);

// to convert string to lower case
String s4 = "FARIDPUR IS MY HOME TOWN";
System.out.println(s4.toLowerCase());

// to convert string to upper case
String s5 = "dhaka is my home town";
System.out.println(s5.toUpperCase());

// lets try equals

if(s4.equals(s5)) {
    System.out.println("They are equal. ");
}else {
    System.out.println("They arent equal.");
    // we can use == instead of .equals ......(as ur wish HEHE<3)

}

    }
}
