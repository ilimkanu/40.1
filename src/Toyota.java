import java.util.Objects;

public class Toyota {
    private String model;
    private Long serialNumber;

    public Toyota(String model, Long serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "model='" + model + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return Objects.equals(model, toyota.model) &&
                Objects.equals(serialNumber, toyota.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, serialNumber);
    }
}
