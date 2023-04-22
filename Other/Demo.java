
class Student{
    int math;
    int science;
    int english;
    Student(int m,int s, int e){
        math=m;
        science=s;
        english=e;
    }
    int avg(){
        return (math+science+english)/3;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Student s=new Student(75, 69, 70);
        System.out.println("Math: "+s.math);
        System.out.println("Science: "+s.science);
        System.out.println("English: "+s.english);
        System.out.println("Average mark: "+s.avg());
        
    }
}
