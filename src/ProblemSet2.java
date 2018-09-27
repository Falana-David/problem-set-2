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
		System.out.println();
		System.out.println("Hello, " + text);		
	}
	
	public void gradeMe() {
		System.out.println();
		System.out.println("Enter Your Homework Grade!");
		Scanner in = new Scanner(System.in);
		float grade = in.nextFloat();
		System.out.println();
		System.out.println("Enter Your Quiz Grade!");
		Scanner in1 = new Scanner(System.in);
		float grade1 = in1.nextFloat();
		System.out.println();
		System.out.println("Enter Your Test Grade!");
		Scanner in11 = new Scanner(System.in);
		float grade2 = in11.nextFloat();
		float finalgrade = (float) (grade * 0.15 + grade1 * 0.30 + grade2 * 0.55);
		System.out.println();
		System.out.println("Your Final Grade Is A");
		System.out.print(finalgrade);
		System.out.println();
	}
	
	public void groupUs() {
		System.out.println();
		System.out.println("How Many Students Are Attending The Field Trip?");
		Scanner in = new Scanner(System.in);
		int people = in.nextInt();
		System.out.println();
		System.out.println("How Many Teachers Are Attending The Trip");
		Scanner in1 = new Scanner(System.in);
		int teachers = in1.nextInt();
		
		if (people + teachers <= 46 )
		{
			System.out.println("You Will Need One Bus");
			System.out.println("The Amount Of The People On The Bus Is:" + (people + teachers));
		}
		
		else if (people + teachers > 46)
		{
		System.out.println();
		System.out.println("The Amount Of People on The Bus Is: "+ (teachers + people));
		System.out.println();
		int bus = (people + teachers) / 46 + 1;
		System.out.println("Buses Required " + bus );
		}
	}
	
	public void info() {
		System.out.println();
		System.out.println("What Is your First Name?");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println();
		System.out.println("What Is your Last Name?");
		Scanner in1 = new Scanner(System.in);
		String last = in1.nextLine();
		System.out.println();
		System.out.println("What Is your Grade Level?");
		Scanner in11 = new Scanner(System.in);
		int level = in11.nextInt();
		System.out.println();
		System.out.println("What Is your Age?");
		Scanner in111 = new Scanner(System.in);
		int age = in111.nextInt();
		System.out.println();
		System.out.println("What Is your Hometown?");
		Scanner in1111 = new Scanner(System.in);
		String town = in1111.nextLine();
		System.out.println();
		System.out.println("NAME     : " + name + " " + last);
		System.out.println("GRADE    : " + level);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + town);
		System.out.println();
	}
	
	public void initials() {
		System.out.print("Please enter your first name: ");
		Scanner in = new Scanner (System.in);
		String first = in.nextLine();
		char a = first.charAt(0);
		System.out.print("Please enter your middle name: ");
		String middle = in.nextLine();
		char b = middle.charAt(0);
		System.out.print("Please enter your last name: ");
		String end = in.nextLine();
		char c = end.charAt(0);
		System.out.println();
		System.out.println("You initials are " + a + b + c );
	}
}