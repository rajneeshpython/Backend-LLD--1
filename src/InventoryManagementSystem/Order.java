package InventoryManagementSystem;


public class Order implements Comparable<Order>{
    private String orderId;
    private boolean isExpress;

    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public String getOrderId() {
        return orderId;
    }

    public  void setOrderId(String orderId){
        this.orderId = orderId;
    }

    public void setExpress(boolean express) {
        this.isExpress = express;
    }

    @Override
    public int compareTo (Order o) {
        if(this.isExpress == o.isExpress){
           return this.orderId.compareTo(o.orderId);
        } else if ( this.isExpress) {
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", isExpress=" + isExpress +
                '}';
    }
}