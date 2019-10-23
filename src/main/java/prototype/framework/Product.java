package prototype.framework;

// 複製を可能にするためのメソッド
public interface Product extends Cloneable {
    public abstract void use(String s);

    // インスタンスの複製を行うためのメソッド
    public abstract Product createClone();
}
