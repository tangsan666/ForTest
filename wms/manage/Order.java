package wms.manage;

public abstract class Order {
    public String status;

    public Order(String status) {
        this.status = status;
    }

    public Order() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
