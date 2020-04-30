import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int [] arg = {0,2,13,4,8,6} ;
        int min = Arrays.stream(arg)
                .min()
                .getAsInt();
        System.out.println(min);

    }
}
