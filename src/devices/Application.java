package devices;

public class Application {
    public String appName;
    public double appPrice;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public double getAppPrice() {
        return appPrice;
    }

    public void setAppPrice(double appPrice) {
        this.appPrice = appPrice;
    }

    public Application(String appName, double appPrice) {
        this.appName = appName;
        this.appPrice = appPrice;
    }
}
