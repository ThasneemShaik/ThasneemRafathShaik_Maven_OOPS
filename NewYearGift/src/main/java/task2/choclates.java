package task2;

public class choclates extends Sweet {

    String type;

    public choclates(int sweetness, String name, int weight, int price,String type) {
        super(sweetness, name, weight, price);
        this.type=type;
    }
}