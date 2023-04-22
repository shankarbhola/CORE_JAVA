/*
class Student {
    String name="muna";                 //nonstatic variable / instance variable
    int roll=1;
    float mark=90.50f;
}

//Driver class
class Test {
    public static void main(String[] args) {

        Student s= new Student();               //object reference create
        System.out.println(s.name);
        System.out.println(s.roll);
        System.out.println(s.mark);
    }
}
*/

class Student {
    String name;
    int roll;
    float mark;
}


class Test {
    public static void main(String[] args) {

        Student s= new Student();     
        s.name="Kuna";
        s.roll=1;
        s.mark=90.50f;          
        System.out.println(s.name);
        System.out.println(s.roll);
        System.out.println(s.mark);

        Student s2= new Student();     
        s2.name="Muna";
        s2.roll=2;
        s2.mark=75.35f;          
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.mark);
    }
}

