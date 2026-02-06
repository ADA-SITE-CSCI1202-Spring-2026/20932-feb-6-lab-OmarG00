public class Fact {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Error: Number must be non-negative.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}