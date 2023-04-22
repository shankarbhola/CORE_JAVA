import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        System.out.println("----------\nREVERSE\n----------");
        Scanner sc= new Scanner(System.in);
        System.out.println("Input number : ");
        int number=sc.nextInt(),reverse=0,reminder;
        while(number!=0){
            reminder=number%10;
            reverse=reverse*10+reminder;
            number=number/10;
        }
        System.out.println("Reversed number :\n"+reverse);        
    }
}
