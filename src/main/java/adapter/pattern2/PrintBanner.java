package adapter.pattern2;

public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    // Bannerクラスに委譲する
    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}