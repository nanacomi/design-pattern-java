package singleton;

public class Singleton {

    // Singletonクラスのロード時に一回だけ初期化される
    private static Singleton singleton = new Singleton();

    // privateになっているのは、Singletonクラス以外からコンストラクタを呼び足すことを禁止するため
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
