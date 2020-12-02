

import java.util.Scanner;
import java.util.function.BiFunction;

public class Averagetwonumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y = scanner.nextInt();
            BiFunction<Integer,Integer,Integer> biFunction=
                    (x1,y1) -> ((x1 + y1) / 2);
            System.out.println(biFunction.apply(x,y));
    }
}

