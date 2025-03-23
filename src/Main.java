import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, weight, index;
        System.out.print("Enter the height in meters: ");
        height = sc.nextDouble();
        System.out.print("Enter the weight in kilograms: ");
        weight = sc.nextDouble();
        index = weight/(height*height);
        System.out.print("Your body mass index is: " + index);

    }
}