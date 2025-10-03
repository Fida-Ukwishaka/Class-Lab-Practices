
public class average {
    public static void main(String[] args) {
        //System.out.println("Enter three numbers: ");
        //Scanner sc = new Scanner(System.in);
        //int num1 = sc.nextInt();
        //int num2 = sc.nextInt();
        //int num3 = sc.nextInt();
        //int avg = (num1 + num2 + num3) / 3;
        //System.out.println("Average = " + avg);
        //double quotient = num1/num2;
        //System.out.println("Quotient = " + quotient);

        double seconds = 375;
        int minutes = (int)seconds/60;
        double remainingseconds = seconds % 60;
        System.out.println("There are "+minutes+" minutes in "+seconds+" seconds, and "+remainingseconds+" seconds remaining");

        int a = 10;
        int sum = ++a + 3;
        System.out.println(sum);

    }
}
