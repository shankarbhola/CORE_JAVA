import java.util.Scanner;

// public > protected > default (no keyword) > private

/*
class Student {
    private String name;
    private int roll;
    private float mark;

    void init(){
        name="kuna";
        roll=1;
        mark=60.25f;

    }

    void disp(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(mark);
    }
}


class Test {
    public static void main(String[] args) {
        Student s= new Student();
        s.init();
        s.disp();   
    }
}

---------------------------------------------------------------------------*/

/* 
class Rectangle{
    private int length;
    private int width;

    void init(){
        length=5;
        width=7;
    }

    void disp(){
        System.out.println("Length ="+length);
        System.out.println("Width="+width);
    }

    void area(){
        System.out.println("Area="+length*width);
    }

    int perimeter(){
        return(2*(length+width));
    }
}

class Test {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.init();
        r.disp();
        r.area();
        System.out.println("Perimeter="+r.perimeter());
    }
}

-------------------------------------------------------------------------- */

/* 
import java.util.Scanner;
class Rectangle{
    private int length;
    private int width;

    void init(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length");
        length=sc.nextInt();
        System.out.println("Enter Width");
        width=sc.nextInt();
    }

    void disp(){
        System.out.println("Length="+length);
        System.out.println("Width="+width);
    }

    void area(){
        System.out.println("Area="+length*width);
    }

    int perimeter(){
        return(2*(length+width));
    }
}

class Test {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.init();
        r.disp();
        r.area();
        System.out.println("Perimeter="+r.perimeter());
    }
}

-------------------------------------------------------------------------------*/

/* 
class Rectangle{
    private int length;
    private int width;

    void init(int x, int y){
        length=x;
        width=y;
    }

    void disp(){
        System.out.println("Length ="+length);
        System.out.println("Width="+width);
    }

    void area(){
        System.out.println("Area="+length*width);
    }

    int perimeter(){
        return(2*(length+width));
    }
}

class Test {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.init(5,7);
        r.disp();
        r.area();
        System.out.println("Perimeter="+r.perimeter());

        Rectangle r1=new Rectangle();
        r1.init(9,5);
        r1.disp();
        r1.area();
        System.out.println("Perimeter="+r1.perimeter());
    }
}

---------------------------------------------------------------------------------------*/
/* 
import java.util.Scanner;
class Rectangle{
    private int length;
    private int width;

    void init(int x, int y){
        length=x;
        width=y;
    }

    void disp(){
        System.out.println("Length ="+length);
        System.out.println("Width="+width);
    }

    void area(){
        System.out.println("Area="+length*width);
    }

    int perimeter(){
        return(2*(length+width));
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Rectangle r=new Rectangle();
        r.init(sc.nextInt(),sc.nextInt());
        r.disp();
        r.area();
        System.out.println("Perimeter="+r.perimeter());

        Rectangle r1=new Rectangle();
        r1.init(sc.nextInt(),sc.nextInt());
        r1.init(9,5);
        r1.disp();
        r1.area();
        System.out.println("Perimeter="+r1.perimeter());
    }
}

----------------------------------------------------------------------*/

import java.util.Scanner;
class Rectangle{
    private int length;
    private int width;

    void init(int x, int y){
        length=x;
        width=y;
    }

    void disp(){
        System.out.println("Length ="+length);
        System.out.println("Width="+width);
    }

    void area(){
        System.out.println("Area="+length*width);
    }

    int perimeter(){
        return(2*(length+width));
    }
}

class Test {
    public static void main(String[] args) {
        int n=1;
        Scanner sc= new Scanner(System.in);
        while(n==1){
            Rectangle r=new Rectangle();
            r.init(sc.nextInt(),sc.nextInt());
            r.disp();
            r.area();
            System.out.println("Perimeter="+r.perimeter());
            System.out.println("1 for continue 0 for break");
            n=sc.nextInt();
        }
    }
}
