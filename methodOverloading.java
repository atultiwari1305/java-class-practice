class A {
    void show(){
        System.out.println("I am superclass");
    }
}
class B extends A{
    void show(){
        System.out.println("I am subclass");
    }
}
class methodOverloading{
    public static void main(String[] args){
        A obj = new B();
        obj.show();
    }
}