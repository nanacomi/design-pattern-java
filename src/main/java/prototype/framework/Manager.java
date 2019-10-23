package prototype.framework;

import java.util.HashMap;

// Productインターフェースを利用してインスタンスの複製を行うクラス
public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product) showcase.get(protoName);
        return p.createClone();
    }
}
