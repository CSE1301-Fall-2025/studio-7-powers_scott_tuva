public class Die {
    private int roll;
    private int [] range;

    public Die (int n) {
        this.roll = (int)(Math.random()*n + 1);
        this.range.length = n;
    }
}
