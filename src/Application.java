import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so thu 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Nhap vao so thu 2: ");
        double num2 = sc.nextDouble();
        System.out.print("Nhap vao so thu 3: ");
        double num3 = sc.nextDouble();

        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            temp = num3;
            num3 = num1;
            num1 = temp;
        }

        if  (num2 > num3) {
            temp = num3;
            num3 = num2;
            num2 = temp;
        }

        System.out.println("Day so tang dan sau khi sap xep la: " + num1 + ", " + num2 + ", " + num3);

    }
}
