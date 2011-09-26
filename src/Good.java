public class Good {
    private int price;

    public Good(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        Good compared = (Good) o;
        return price == compared.getPrice();
    }
}
