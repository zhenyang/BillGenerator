public class GoodInSale extends Good {
    private int discountPrice;
    private int discountCount;

    public GoodInSale(String name, int price, int discountPrice, int discountCount) {
        super(name, price);
        this.discountPrice = discountPrice;
        this.discountCount = discountCount;
    }

    @Override
    public int getPrice() {
        if (priceBeforeDiscount() < discountPrice) {
            return priceBeforeDiscount();
        } else {
            return priceAfterDiscount();
        }
    }

    private int priceAfterDiscount() {
        return count / discountCount * discountPrice + count % discountCount * price;
    }

    private int priceBeforeDiscount() {
        return super.getPrice();
    }
}
