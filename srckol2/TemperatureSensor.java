public class TemperatureSensor implements Sensor {
    @Override
    public double readValue() {
        return 0;
    }

    @Override
    public String getStatus() {
        return "";
    }

    @Override
    public void reset() {
    System.out.println("Reset");
    }
}
