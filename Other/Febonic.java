public class Febonic {
    public static void main(String[] args) {
        System.out.println("----------\nFEBONIC\n----------");
        int a=0 , b=1 , c=3;
        System.out.println("0\n1");
        for (int i = 0; i < 15; i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
    
}
