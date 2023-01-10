public class SettingArrayBounds {
    private int minBorder;
    private int maxBorder;

    public SettingArrayBounds(int minBorder, int maxBorder) {
        this.minBorder = minBorder;
        this.maxBorder = maxBorder;
    }
    public int getRandomNumber(){
       int randomNumber = (int) Math.round(minBorder + (Math.random() * (maxBorder-minBorder)));
        return randomNumber;
    }

    public int getMinBorder() {
        return minBorder;
    }

    public void setMinBorder(int minBorder) {
        this.minBorder = minBorder;
    }

    public int getMaxBorder() {
        return maxBorder;
    }

    public void setMaxBorder(int maxBorder) {
        this.maxBorder = maxBorder;
    }

    @Override
    public String toString() {
        return "SettingArrayBounds{" +
                "minBorder=" + minBorder +
                ", maxBorder=" + maxBorder +
                '}';
    }
}
