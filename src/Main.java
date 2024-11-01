import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int area = sc.nextInt();
		while (area!=0) {
			//do things here.
			printShape(area);
			area = sc.nextInt();
		}
	}

	private static void printShape(int area) {
		int width = (int)Math.sqrt(area);
		
		while (area % width !=0) {
			width--;
		}
		
		int length = area / width;
		int perimeter = (width+length)*2;
		
		System.out.println("Minimum perimeter is "+perimeter+" with dimensions "+width+" x "+length);
		
	}

}
