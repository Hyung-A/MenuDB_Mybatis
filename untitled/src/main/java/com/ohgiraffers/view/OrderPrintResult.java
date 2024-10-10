package com.ohgiraffers.view;

import com.ohgiraffers.common.DTO.OrderDTO;

import java.util.List;

public class OrderPrintResult {
    public void printOrder(List<OrderDTO> orderList) {
        for (OrderDTO order : orderList) {
            System.out.println(order);
        }
    }

    public void printErrorMessage(String message) {

        String errorMessage = "";
        switch (message) {
            case "selectOne" : errorMessage = "총 주문 내역 조회에 실패했습니다."; break;
        }

        System.out.println(errorMessage);
    }
}
