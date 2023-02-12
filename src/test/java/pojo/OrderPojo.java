package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderPojo {
    @SerializedName("bookId")
    @Expose private int bookId;

    @SerializedName("customerName")
    @Expose private  String customerName;

    @SerializedName("created")
    @Expose private Boolean created;

    @SerializedName("orderId")
    @Expose private String orderId;

    public OrderPojo(int bookId, String customerName) {
        this.bookId = bookId;
        this.customerName = customerName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Boolean getCreated() {
        return created;
    }

    public void setCreated(Boolean created) {
        this.created = created;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
