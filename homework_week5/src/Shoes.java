public class Shoes {
    private long price;
    private String feature;

    public Shoes(long price, String feature) {
        this.price = price;
        this.feature = feature;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
