
public class Main {

    public static void main(String[] args) {

        Converter c = new Converter();

        System.out.println(c.numberToWord(0));
        System.out.println(c.numberToWord(1));
        System.out.println(c.numberToWord(16));

        System.out.println(c.wordToNumber("zero"));
        System.out.println(c.wordToNumber("one"));
        System.out.println(c.wordToNumber("sixteen"));

    }

}
