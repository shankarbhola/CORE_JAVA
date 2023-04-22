class Complex{
    void disp(int a){
        System.out.println(this); // void disp(Complex final this)
        System.out.println(a);
    }
}

class Test{
    public static void main(String[] args) {
        Complex c=new Complex();
        System.out.println(c);
        c.disp(5);  //implictly c.disp(c);
    }
}
