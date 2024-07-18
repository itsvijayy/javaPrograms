package src.javaPrograms;

public class NumberCounts {
    public static void main(String[] args) {
        int n = 234234432;

        int count = 0;
        while(n > 0) {
            int remainder = n % 10;
            if (remainder == 3) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
