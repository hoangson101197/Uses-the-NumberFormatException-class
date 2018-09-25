import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("\nEnter y: ");
        int y = sc.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.caculate(x, y);
    }

    private void caculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum x + y: " + a);
            System.out.println("Sign x - y: " + b);
            System.out.println("x * y: " + c);
            System.out.println("x / y: " + d);
        } catch (Exception e) {
            System.out.println("Exceptions occur: " +e.getMessage());
        }
    }
}
