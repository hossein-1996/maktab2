

import java.util.Scanner;
import java.util.function.Predicate;


public class StartAndEndLetter {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your word : ");
        String word=scanner.next();
        Predicate<String> sameletter= w -> w.substring(0, 1).equals(  w.substring(w.length() - 1));
       if( sameletter.test(word)){
           System.out.println(sameletter.test(word)+" : start character and end character are equal");
       }else {
           System.out.println(sameletter.test(word)+" : start character and end character are not equal");
       }
    }
}
