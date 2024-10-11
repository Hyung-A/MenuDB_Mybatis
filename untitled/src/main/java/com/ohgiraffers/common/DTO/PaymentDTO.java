package com.ohgiraffers.common.DTO;

public class PaymentDTO {

    private int payment_code;
    private String payment_date;
    private String payment_time;
    private int payment_price;
    private String payment_type;

    public PaymentDTO(){}

    public PaymentDTO(int payment_code, String payment_date, String payment_time, int payment_price, String payment_type) {
        this.payment_code = payment_code;
        this.payment_date = payment_date;
        this.payment_time = payment_time;
        this.payment_price = payment_price;
        this.payment_type = payment_type;
    }

    public int getPayment_code() {
        return payment_code;
    }

    public void setPayment_code(int payment_code) {
        this.payment_code = payment_code;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public String getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(String payment_time) {
        this.payment_time = payment_time;
    }

    public int getPayment_price() {
        return payment_price;
    }

    public void setPayment_price(int payment_price) {
        this.payment_price = payment_price;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "payment_code=" + payment_code +
                ", payment_date='" + payment_date + '\'' +
                ", payment_time='" + payment_time + '\'' +
                ", payment_price=" + payment_price +
                ", payment_type='" + payment_type + '\'' +
                '}';
    }
}
