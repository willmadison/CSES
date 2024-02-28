import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(reader.readLine());

        String rawInput = reader.readLine();

        Collection<Long> numbers = Arrays.stream(rawInput.split(Pattern.quote(" ")))
                .map(Long::parseLong).collect(Collectors.toList());

        long expectedSum = n*(n+1)/2;
        long sum = numbers.stream().reduce(0L, Long::sum);

        System.out.println(expectedSum-sum);
    }
}
