package templateMethod;

// 抽象クラス（書籍上のAbstractDisplay）
public abstract class Display {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    // finalをつけるとサブクラスでオーバーライドできないことを意味する
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
