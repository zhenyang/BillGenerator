public class Good {
    protected String name;
    protected int price;
    protected int count;

    public Good(String name, int price) {
        this.name = name;
        this.price = price;
        this.count = 1;
    }

    public int getPrice() {
        return price * count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void addCount() {
        this.count++;
    }
}
