import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your num a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter your num b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter your num c: ");
        double c = scanner.nextDouble();
        QuadraticEquation newQuadratic = new QuadraticEquation(a,b,c);
        System.out.println(newQuadratic.getDiscriminant());
    }
}
