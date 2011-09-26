public class GoodFactory {
    public static Good create(String name) {
        if (name.equals("A")) {
            return new Good(50);
        }
        if (name.equals("B")) {
            return new Good(30);
        }
        if (name.equals("C")) {
            return new Good(20);
        }
        return new Good(15);
    }
}
