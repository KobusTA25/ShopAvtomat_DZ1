class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
