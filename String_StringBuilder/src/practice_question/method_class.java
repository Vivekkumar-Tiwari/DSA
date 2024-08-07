package practice_question;

import java.util.Arrays;

public class method_class {
    public static void main(String[] args) {
        String name = "kunal kushwaha hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("      Vivek     ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
