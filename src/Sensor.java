public interface Sensor {
    double readValue();
    String getStatus();
    void reset();
}
