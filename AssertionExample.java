import java.util.*;

public class AssertionExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int value = sc.nextInt();
        assert value>=18:"Not Valid";
        System.out.println("value is "+value);
        sc.close();
    }
}
