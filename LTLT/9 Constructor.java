class A{
    A(){
        System.out.println("Zero Constructor");
    }

    A(int x){
        System.out.println("Parameter Constructor");
    }
}

class Test {
    public static void main(String[] args) {
        A ob=new A(8);
        A ob1=new A();
    }
}