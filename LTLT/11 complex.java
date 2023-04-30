// class complex{
//     private int r,i;
//     complex(int r, int i){
//         this.r = r;
//         this.i = i;
//     }
//     complex(){
//         r=0;
//         i=0;
//     }
//     void disp(){
//         System.out.println(r+"+"+i+"i");
//     }
//     void add(complex c2){
//         complex c3 = new complex();
//         c3.r = this.r+c2.r;
//         c3.i = i+c2.i;
//         c3.disp();
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         complex c1 = new complex(2,3);
//         complex c2 = new complex(4,5);
//         c1.disp();
//         c2.disp();
//         c1.add(c2);
//     }
// }




//Static block

// class Test{
//     static int x;
//     static{
//         System.out.println("Static block 1");
//         x= 10;
//     }
//     public static void main(String[] args) {
//         System.out.println("main Method "+x+" "+y);
//     }
//     static{
//         System.out.println("Static block 2 "+x);
//     }
//     static int y;
// }


class Test{
    int x;
    {
        System.out.println("NonStatic block 1");
        x= 10;
    }
    Test(){
        System.out.println("Constructor");
        x=20;
        y=30;
    }
    public static void main(String[] args) {
        System.out.println("main Method");
        Test t = new Test();
        System.out.println(t.x+" "+t.y);
    }
    static{
        System.out.println("Static block 2 ");
    }
    static int y;
}