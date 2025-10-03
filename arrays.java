public class arrays{
    public static void main(String[] args) {
        int[] ages = {16, 18, 17, 28, 19, 21, 24, 30, 17, 15};
        int SumOfAges = 0;
        double AverageAge = 0.0;
        int largestAge = 0;
        int SmallestAge = ages[0];
        for (int i = 0; i<ages.length; i++) {
            SumOfAges += ages[i];
            AverageAge = (double)SumOfAges / ages.length;
            if (ages[i] > largestAge) {
                largestAge = ages[i];
            }
            if (ages[i] < SmallestAge) {
                SmallestAge = ages[i];
            }
        }
        System.out.println("The sum of ages is: " + SumOfAges);
        System.out.println("The average age is: " + AverageAge);
        System.out.println("The largest age is: " + largestAge);
        System.out.println("The smallest age is: " + SmallestAge);
    }
}

