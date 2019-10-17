package factoryMethod.idcard;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List owners = new ArrayList();
    private int number = 1;

    // IDCardのインスタンスを生成する
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, number++);
    }

    // IDCardのownerをownersフィールドに追加して「登録」をいう機能を実現
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
