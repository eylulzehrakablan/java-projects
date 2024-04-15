public class Sum1To1000 {
        public static void main(String[] args) {
            int sum = 0;

            for (int i = 1; i <= 1000; i++) {
                sum += i;
            }
            System.out.println("The sum of numbers from 1 to 1000 is: " + sum);
        }
    }