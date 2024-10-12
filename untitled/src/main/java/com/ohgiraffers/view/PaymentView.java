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
            case "insert" : errorMessage = "Payment 등록을 실패하였습니다."; break;
            case "update" : errorMessage = "Payment 수정을 실패하였씁니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode){

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "Payment 등록을 성공하였습니다."; break;
            case "update" : successMessage = "Payment 수정을 성공하였습니다."; break;
        }

        System.out.println(successMessage);
    }
}

