import java.util.*;

import javax.print.event.PrintJobListener;
class Emp{
    private String name;
    private int id;
    private float sal;

    void init(String n, int i, Float s){
        name=n;
        id=i;
        sal=s;
    }
    void disp(){
        System.out.println("name="+name+" id="+id+" Salary="+sal);
    }
    void calc(){
        float ta,da,total;
        if(sal>=5000){
            ta=sal*0.5f;
            da=sal*0.5f;
        }
        else{
            ta=sal*0.2f;
            da=sal*0.2f;
        }
        total=sal+ta+da;
        System.out.println("Ta="+ta);
        System.out.println("Da="+da);
        System.out.println("Total="+total);
    }
}




class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Emp e= new Emp();
        System.out.println("Enter Name   Id   Salary");
        e.init(sc.nextLine(),sc.nextInt(),sc.nextFloat());
        e.disp();
        e.calc();
    }
}