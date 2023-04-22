import java.util.*;;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("----------\nPALINDROME\n----------");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number=sc.nextInt() ;
        int number2=number;
        int reminder=0 , reverse=0;
        while (number!=0) {
            reminder= number%10;
            reverse= reverse*10+reminder;
            number=number/10;
        }
        if (number2==reverse) {
            System.out.println(number2+" is a palindrome number");
        } else {
            System.out.println(+number2+" is not a palindrome number");
        }
    }
    
}
