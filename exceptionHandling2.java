class ab extends Exception{

}

public class exceptionHandling2 {
    public static void validate(int age){
        if(age<18){
            try{
                throw new ab();
            }
            catch(ab e){
                System.out.println("This age is not allowed.");
            }
        }
        else{
            System.out.println("Person is eligible to vote.");
        }
    }
    public static void main(String[] args){
        validate(18);
        System.out.println("Rest of the code");
    }
}
