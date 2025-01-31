package com.ohgiraffers.common.DTO;

public class OrderDTO {
        private int code;
        private String date;
        private String time;
        private int totalPrice;

    public  OrderDTO(){}

    public OrderDTO(int code, String date, String time, int totalPrice) {
        this.code = code;
        this.date = date;
        this.time = time;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "code=" + code +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
