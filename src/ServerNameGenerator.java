public class ServerNameGenerator {


    public static String randomName(){
        String[] nouns = {"mountain","friend","bear","poison","jar","pail","sponge","instrument","picture","bee"};
        String[] adjectives = {"longing","horrible","rare","maniacal","versed","groovy","utopian","mushy","wicked","harmonious"};
        double randomNum1 = Math.round(Math.random() * (9 - 0) + 0);
        double randomNum2 = Math.round(Math.random() * (9 - 0) + 0);
        return adjectives[(int) randomNum1] + "-" + nouns[(int) randomNum2];
    }






    public static void main(String[] args) {
        System.out.println(randomName());


    }
}
