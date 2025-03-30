package cursuriPractice.systemConfig;

public class SystemConfig {
    String os;
    int ram;
    int cores;
    String diskType;
    double discSize;

    void setOs(String os) {
        this.os = os;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public void setDiscSize(double discSize) {
        this.discSize = discSize;
    }

    @Override
    public String toString() {
        return "SystemConfig{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", cores=" + cores +
                ", diskType='" + diskType + '\'' +
                ", discSize=" + discSize +
                '}';
    }
}
