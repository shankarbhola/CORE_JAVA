// class Complex{
//     void disp(int a){
//         System.out.println(this); // void disp(Complex final this)
//         System.out.println(a);
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         Complex c=new Complex();
//         System.out.println(c);
//         c.disp(5);  //implictly c.disp(c);
//     }
// }




// class Test {
//     int x,y;
//     Test(int x, int y){
//         this.x = x;
//         this.y = y;
//     }
//     void disp(){
//         System.out.println(x+" "+y);
//     }
//     public static void main(String[] args) {
//         Test t = new Test(10,20);
//         t.disp();
//     }
// }



// class Test{
//     Test(int x){
//         System.out.println("Parameter Constructor");
//     }
//     Test(){
//         this(10);
//         System.out.println("Default Constructor");
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//     }
// }



class Test{
    void disp(){
        System.out.println(this);
    }
    void show(){
        System.out.println(this);
        this.disp();
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t);
        t.show();
    }
}