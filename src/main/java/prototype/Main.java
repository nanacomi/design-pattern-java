package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class Main {
    public static void main(String[] args) {

        Manager  manager = new Manager();
        UnderlinePen uPen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBpx = new MessageBox('/');

        manager.register("strong message", uPen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBpx);


        Product p1 = manager.create("strong message");
        p1.use("Hello World.");

        Product p2 = manager.create("warning box");
        p2.use("Hello World.");

        Product p3 = manager.create("slash box");
        p3.use("Hello World.");
    }
}
