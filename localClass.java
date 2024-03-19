class A{
    void fun(){
        System.out.println("Hey, I am from the outer class A");
        class AA{
            void fun1(){
                System.out.println("Hey, I am from the nested inner class AA");
            }
        }
        class AB{
            void fun2(){
                System.out.println("Hey, I am from the nested inner class AB");
            }
        }
        AA obj1 = new AA();
        obj1.fun1();
        AB obj2 = new AB();
        obj2.fun2();
    }
}

public class localClass {
    public static void main(String[] args){
        A obj = new A();
        obj.fun();
    }
}
