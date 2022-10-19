package BasicJava;

public class QuestionNo1C {
    public static void main(String[] args) {
        String stars = "*****";
        String stripes = "=====";
        int i = 0;
        while (i < 10)
        {
            if (i % 2 == 0) { System.out.println(stars); }
            else { System.out.println(stripes); }
        }
    }
}
