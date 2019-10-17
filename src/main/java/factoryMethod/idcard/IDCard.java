package factoryMethod.idcard;

import factoryMethod.framework.Product;

public class IDCard extends Product {

    private String owner;
    private int number;

    //修飾子がない場合は同じパッケージないからのみ参照可能
    IDCard(String owner, int number) {
        System.out.println(number + ":" + owner + "のカードを作ります。");
        this.owner = owner;
        this.number = number;
    }

    @Override
    public void use() {
        System.out.println(number + ":" + owner + "のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }
}
