package builder;

// 文書を構成するためのメソッドを定めた抽象クラス
public interface Builder {
    void makeTitle(String title);
    void makeString(String str);
    void makeItems(String[] items);
    void close();
}
