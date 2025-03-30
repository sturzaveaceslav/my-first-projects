package cursuriPractice.systemConfig;


public class DeviceStore {
    static void saveDeviceConfig(SystemConfig systemConfig) {

    }

    public static void main(String[] args) {
        SystemConfig systemConfig = new SystemConfig();
        systemConfig.setOs("windows");
        systemConfig.setDiscSize(250);
        systemConfig.setCores(4);
        systemConfig.setRam(1024);
        systemConfig.setDiskType("orice");

        saveDeviceConfig(systemConfig);
        System.out.println("Device configuration before saving: " + systemConfig);

    }


}
