import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your width: ");
        double width = input.nextDouble();
        System.out.print("Enter your height: ");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Your Area \n" + rectangle.getArea());
        System.out.println("Your Perimeter \n" + rectangle.getPerimeter());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());
    }
}
