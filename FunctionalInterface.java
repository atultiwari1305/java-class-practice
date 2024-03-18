import java.util.*;
public class FunctionalInterface {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(120);
        arrList.add(121);
        arrList.add(122);
        arrList.add(123);
        arrList.add(1204);
        arrList.add(12);
        arrList.add(1211);
        arrList.forEach(number-> System.out.println(number));
        System.out.println("Display all odd elements");
        arrList.forEach(number->{if(number%2!=0){
            System.out.println(number);
        }});
        System.out.println("Display all even elements");
        arrList.forEach(number->{if(number%2==0){
            System.out.println(number);
        }});
    }
}
