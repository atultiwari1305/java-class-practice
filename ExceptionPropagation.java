public class ExceptionPropagation {
    void m(){
        // int data = 50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }
        catch(ArithmeticException e){
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] args){
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.p();
        System.out.println("Normal Flow");
    }
}
