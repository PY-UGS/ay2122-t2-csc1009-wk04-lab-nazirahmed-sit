import java.util.Scanner;

public class mainBMI {
    public static void main (String[] args) {

        double weight;
        double height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();

        System.out.print("Enter weight in inches: ");
        height = input.nextDouble();

        BMI userBMI = new BMI(weight, height);

        System.out.println("BMI is " + userBMI.compute(weight, height));
        System.out.println(userBMI.classification(userBMI.compute(weight, height)));

        input.close();

    }
}

