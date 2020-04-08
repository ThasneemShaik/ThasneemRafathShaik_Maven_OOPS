package task2;

public class candy extends Sweet{
    String type;

    public candy(int sweetness, String name, int weight, int price, String type) {
        super(sweetness, name, weight, price);
        this.type = type;
    }
}
