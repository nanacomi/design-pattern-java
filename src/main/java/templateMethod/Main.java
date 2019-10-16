package templateMethod;

public class Main {
    public static void main(String[] args) {

        Display d1 = new CharDisplay('H');

        Display d2 = new StringDisplay("Hello, world.");

        Display d3 = new StringDisplay("こんにちは。");

        d1.display();
        d2.display();
        d3.display();
    }
}
