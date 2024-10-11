package com.ohgiraffers.controller;


import com.ohgiraffers.common.DTO.PaymentDTO;
import com.ohgiraffers.service.PaymentService;
import com.ohgiraffers.view.PaymentView;

import java.util.List;

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
}
