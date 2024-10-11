package com.ohgiraffers.view;

import com.ohgiraffers.common.DTO.PaymentDTO;

import java.util.List;

public class PaymentView {

    public void printPaymentList(List<PaymentDTO> paymentList){

        for(PaymentDTO payment : paymentList){
            System.out.println(payment);
        }
    }

    public void printPayment(PaymentDTO payment){

        System.out.println(payment);
    }

    public void printErrorMessage(String errorCode){

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "Payment 목록 조회를 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode){

        String successMessage = "";
        switch (successCode) {
        }

        System.out.println(successMessage);
    }
}

