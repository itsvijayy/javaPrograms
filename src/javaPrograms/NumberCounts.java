package src.javaPrograms;

public class NumberCounts {
    public static void main(String[] args) {
        /*
            Program to get the counts of repeated number
         */
        int n = 234234432;

        int count = 0;
        /*
            Logic ->
                n % 10 and check if the remainder == the number(in below e.g 3)
                then increase the count
                and then number/10
         */
        while (n > 0) {
            int remainder = n % 10;
            if (remainder == 3) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
