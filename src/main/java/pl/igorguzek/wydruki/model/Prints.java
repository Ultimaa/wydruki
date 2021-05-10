package pl.igorguzek.wydruki.model;

public class Prints {

    private String plateNumber;

    private int tempFrom;
    private int tempTo;

    private String dataTimeRange;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getTempFrom() {
        return tempFrom;
    }

    public void setTempFrom(int tempFrom) {
        this.tempFrom = tempFrom;
    }

    public int getTempTo() {
        return tempTo;
    }

    public void setTempTo(int tempTo) {
        this.tempTo = tempTo;
    }

    public String getDataTimeRange() {
        return dataTimeRange;
    }

    public void setDataTimeRange(String dataTimeRange) {
        this.dataTimeRange = dataTimeRange;
    }

    @Override
    public String toString() {
        return "Prints{" +
                "plateNumber='" + plateNumber + '\'' +
                ", tempFrom=" + tempFrom +
                ", tempTo=" + tempTo +
                ", dataTimeRange='" + dataTimeRange + '\'' +
                '}';
    }
}
