package singleton.excercise2;

public class Triple {

    private static Triple[] triple = new Triple[] {
            new Triple(1),
            new Triple(2),
            new Triple(3)
    };

    private int id;

    private Triple(int id) {
        System.out.println(id + " : インスタンスを生成しました");
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triple[id];
    }

    public String toString() {
        return "[Triple id = " + id + "]";
    }
}
