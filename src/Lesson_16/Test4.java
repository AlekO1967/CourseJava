package Lesson_16;

public class Test4 {
    public static void main(String[] args) {
        String s1 = new String(" HeLlO");
        String s2 = s1.toLowerCase();
        String s3 = s1.toUpperCase();
        String s4 = s2.concat(s3); // это отсебятина... на лекции)))
        System.out.println(s4);
        boolean b = s1.contains("HeL");
        boolean b1 = s1.contains("hEl");
        System.out.println(b);
        System.out.println(b1);
    }
}
