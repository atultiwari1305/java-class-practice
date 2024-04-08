import java.util.*;
public class PasswordMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder password = new StringBuilder();
        System.out.print("Enter 8 digit password: ");
        for(int i=0;i<8;i++){
            char s = sc.next().charAt(0);
            System.out.print("*");
            password.append(s);
        }
        System.out.println("Your password is: "+password);
        sc.close();
    }
}
