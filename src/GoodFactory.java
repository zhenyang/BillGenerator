public class GoodFactory {

    public Good createGoodByName(String name) {
        if (name.equals("A")) {
            return new GoodInSale("A", 50, 130,3);
        }
        if (name.equals("B")) {
            return new Good("B", 30);
        }
        if (name.equals("C")) {
            return new Good("C", 20);
        }
        if (name.equals("D")) {
            return new Good("D", 15);
        }
        return null;
    }
}
