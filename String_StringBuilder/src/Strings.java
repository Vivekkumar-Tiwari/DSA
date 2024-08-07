public class Strings {
    public static void main(String[] args) {
        String a = new String("Vivek");
        String b = new String("Vivek");
//        System.out.println(a==b);//this is false because of two diffrent object's;
        System.out.println(a.equals(b));//value is same that's why this is true;

        System.out.println(a.charAt(0));
    }
}
