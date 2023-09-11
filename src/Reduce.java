public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int num_steps = 0;

        while(n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n--;
            }
            num_steps++;
        }
        System.out.println(num_steps);
    }
}
