public class DiscountRule {
    private String name;
    private int count;
    private int off;

    public DiscountRule(String name, int count, int off) {
        this.name = name;
        this.count = count;
        this.off = off;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getOff() {
        return off;
    }
}
