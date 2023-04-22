import java.util.Scanner;
class Scan{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name Empid Salery address gander marriage");
        String name=sc.nextLine();
        int id=sc.nextInt();
        float sal=sc.nextFloat();
        sc.nextLine();
        String ad=sc.nextLine();
        char gd=sc.next().charAt(0);
        boolean m= sc.nextBoolean();

        System.out.println("Name= "+name);
        System.out.println("Id= "+id);
        System.out.println("Salery= "+sal);
        System.out.println("Address= "+ad);
        System.out.println("Gender= "+gd);
        System.out.println("Marriage= "+m);
    }
}