public class NestedClassOuter {
    static int data = 30;
    void msg1(){
        int data=12;
        System.out.println("Outer value of data is: "+data);
    }
    static class InnerClass{
        void msg(){
            System.out.println("Inner value of data is: "+data);
        }
    }
    public static void main(String[] args) {
        NestedClassOuter.InnerClass obj1 = new NestedClassOuter.InnerClass();
        NestedClassOuter obj2 = new NestedClassOuter();
        obj1.msg();
        obj2.msg1();
    }
}
//static nested class