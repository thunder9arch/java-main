import java.util.*;
class FirstClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=sc.next();//it prints first word only if we write it sc.nextLine() then it prints the line
        System.out.print("Your name is "+name);
    }
}
