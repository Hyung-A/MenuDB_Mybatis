package com.ohgiraffers.view;

import com.ohgiraffers.common.DTO.OrderDTO;

import java.util.List;

public class OrderPrintResult {
    public void printOrderList(List<OrderDTO> orderList) {
        for (OrderDTO order : orderList) {
            System.out.println(order);
        }
    }




    public void printErrorMessage(String message) {

        String errorMessage = "";
        switch (message) {
            case "selectAll" : errorMessage = "총 주문 내역 조회에 실패했습니다."; break;
            case "selectOne" : errorMessage = "주문 내역 조회에 실패했습니다."; break;
            case "insert" : errorMessage = "주문 내역 추가에 실패했습니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printOrder(OrderDTO order) {
        System.out.println(order);
    }

    public void printSuccessMessage(String message) {
        String successMessage = "";
        switch (message) {
            case "insert" : successMessage = "주문 내역 추가에 성공했습니다."; break;
        }

        System.out.println(successMessage);
    }
}
