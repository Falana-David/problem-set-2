import java.util.Scanner;
public class ProblemSet2 {
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("Enter First and Last Name!");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println("Hello, " + text);
		in.close();
		
	}
	
	public void gradeMe() {
		System.out.println("Enter Your Homework Grade!");
		Scanner in = new Scanner(System.in);
		String text2 = in.nextLine();
		in.close();
		System.out.println("Enter Your Quiz Grades!");
		Scanner in = new Scanner(System.in);
		String text3 = in.nextLine();
		in.close();
		System.out.println("Enter Your Test Grades!");
		Scanner in = new Scanner(System.in);
		String text4 = in.nextLine();
		System.out.println("Hello, ");
		in.close();
	}
	
	public void groupUs() {
		
	}
	
	public void info() {
		
	}
	
	public void initials() {
		
	}
}