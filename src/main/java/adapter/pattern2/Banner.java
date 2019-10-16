package adapter.pattern2;

// 「委譲」
// PrintBannerのprintWeek()が呼ばれた時はこのクラスで処理する.
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}