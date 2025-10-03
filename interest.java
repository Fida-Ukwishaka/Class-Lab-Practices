import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        System.out.println("How much do you currently have? ");
        Scanner sc = new Scanner(System.in);
        Double initial = sc.nextDouble();
        System.out.println("The interest rate: ");
        Double rate = sc.nextDouble();
        System.out.println("Years are you investing: ");
        Double years = sc.nextDouble();
        Double amount = initial * Math.pow((1 + rate), years);
        System.out.println("After " + years + " Years at " + rate + "% interest, you will have $" + amount);
    }
}
