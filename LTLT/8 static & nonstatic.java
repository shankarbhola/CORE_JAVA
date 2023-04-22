class Demo {
    static void f1(){
        System.out.println("Static method f1");
    }
    void f2(){
        System.out.println("Nonstatic method f2");
    }
    void show(){
        System.out.println("Nonstatic method show");
        f1();
        f2();
    }
}


class Test {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.show();
    }
}