package adapter.pattern2;

// 「インスタンスによる」Adaptorパターン
// 「委譲（あるメソッドの実際の処理を他のインスタンスのメソッドに任せる）」を使って適合を行う
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}