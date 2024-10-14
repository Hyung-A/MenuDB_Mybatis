package com.ohgiraffers.controller;

import com.ohgiraffers.common.DTO.OrderDTO;
import com.ohgiraffers.service.OrderService;
import com.ohgiraffers.view.OrderPrintResult;

import java.util.List;


public class OrderController {
    private final OrderPrintResult orderPrintResult;
    private final OrderService orderService;

    public OrderController(){
        orderPrintResult = new OrderPrintResult();
        orderService = new OrderService();
    }

    public void selectAllOrder() {

        List<OrderDTO> orderList = orderService.selectAllOrder();

        if(orderList != null && orderList.size() > 0){
            orderPrintResult.printOrder(orderList);
        }else{
            orderPrintResult.printErrorMessage("selectOne");
        }

    }

}
