import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(reader.readLine());

        while (n != 1) {
            System.out.print(n);
            System.out.print(" ");

            long remainder = n % 2;

            if (remainder == 0) {
                n /= 2;
            } else {
                n = 3*n+1;
            }

        }

        System.out.print(n);

    }
}
