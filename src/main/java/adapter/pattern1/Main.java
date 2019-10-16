package adapter.pattern1;

// クラスによるadaptorパターン
// 継承を使って適合（adaptor）を行う
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}