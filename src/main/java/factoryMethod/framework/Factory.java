package factoryMethod.framework;

// frameworkパッケージはidcardパッケージに依存しない
public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 製品を作る
    protected abstract Product createProduct(String owner);

    // 製品を登録する
    protected abstract void registerProduct(Product product);
}
