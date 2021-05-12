package pl.igorguzek.wydruki.model;

public class Prints {

    private String plateNumber;

    private int temp;
    private int tempRange;
    private int timeRange;

    private String dateTimeRange;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getTempRange() {
        return tempRange;
    }

    public void setTempRange(int tempRange) {
        this.tempRange = tempRange;
    }

    public int getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(int timeRange) {
        this.timeRange = timeRange;
    }

    public String getDateTimeRange() {
        return dateTimeRange;
    }

    public void setDateTimeRange(String dateTimeRange) {
        this.dateTimeRange = dateTimeRange;
    }

    @Override
    public String toString() {
        return "Prints{" +
                "plateNumber='" + plateNumber + '\'' +
                ", temp=" + temp +
                ", tempRange=" + tempRange +
                ", timeRange=" + timeRange +
                ", dateTimeRange='" + dateTimeRange + '\'' +
                '}';
    }
}
