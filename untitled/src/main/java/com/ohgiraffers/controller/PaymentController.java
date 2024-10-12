package com.ohgiraffers.controller;


import com.ohgiraffers.common.DTO.PaymentDTO;
import com.ohgiraffers.service.PaymentService;
import com.ohgiraffers.view.PaymentView;

import java.util.List;
import java.util.Map;

public class PaymentController {

    private final PaymentView paymentView;
    private final PaymentService paymentService;

    public PaymentController(){
        paymentView = new PaymentView();
        paymentService = new PaymentService();
    }


    public  void selectAllPaymentInfo() {

        List<PaymentDTO> paymentList = PaymentService.selectAllPaymentInfo();

        if (paymentList != null) {
            paymentView.printPaymentList(paymentList);
        } else {
            paymentView.printErrorMessage("selectList");
        }
    }

    public void registPayment(Map<String, String> parameter) {

        String date = parameter.get("payment_date");
        String time = parameter.get("payment_time");
        int price = Integer.parseInt(parameter.get("payment_price"));
        String type = parameter.get("payment_type");

        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setPayment_date(date);
        paymentDTO.setPayment_time(time);
        paymentDTO.setPayment_price(price);
        paymentDTO.setPayment_type(type);

        if(paymentService.registPayment(paymentDTO)) {
            paymentView.printSuccessMessage("insert");
        } else{
            paymentView.printErrorMessage("insert");
        }


    }

    public void modifyPayment(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("payment_code"));
        String date = parameter.get("payment_date");
        String time = parameter.get("payment_time");
        int price = Integer.parseInt(parameter.get("payment_price"));
        String type = parameter.get("payment_type");

        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setPayment_code(code);
        paymentDTO.setPayment_date(date);
        paymentDTO.setPayment_time(time);
        paymentDTO.setPayment_price(price);
        paymentDTO.setPayment_type(type);

        if(paymentService.modifyPayment(paymentDTO)) {
            paymentView.printSuccessMessage("update");
        } else {
            paymentView.printErrorMessage("update");
        }
    }

    public void deletePayment(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("payment_code"));

        if (paymentService.deletePayment(code)) {
            paymentView.printSuccessMessage("delete");
        } else {
            paymentView.printErrorMessage("delete");
        }

    }

}
