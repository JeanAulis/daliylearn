import java.util.Scanner;

public class Demo06{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("please enter your age:");
		int age = sc.nextInt();
		
		
		System.out.print("please enter your name:");
		String name = sc.next();
		
		
		System.out.println("your age is " + age);
		System.out.println("your name is " + name);
	}
}