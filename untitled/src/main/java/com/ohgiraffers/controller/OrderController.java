package com.ohgiraffers.controller;

import com.ohgiraffers.common.DTO.OrderDTO;
import com.ohgiraffers.service.OrderService;
import com.ohgiraffers.view.OrderPrintResult;

import java.util.List;
import java.util.Map;


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
            orderPrintResult.printOrderList(orderList);
        }else{
            orderPrintResult.printErrorMessage("selectAll");
        }

    }

    public void selectOrderByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("orderCode"));

        OrderDTO order = orderService.selectOrderByCode(code);

        if(order != null){
            orderPrintResult.printOrder(order);
        }else {
            orderPrintResult.printErrorMessage("selectOne");
        }
    }

    public void insertOrder(Map<String, String> parameter) {
        String date = parameter.get("date");
        String time = parameter.get("time");
        int totalPrice = Integer.parseInt(parameter.get("totalPrice"));

        OrderDTO order = new OrderDTO();
        order.setDate(date);
        order.setTime(time);
        order.setTotalPrice(totalPrice);

        int result = orderService.insertOrder(order);
        if(result > 0){
            orderPrintResult.printSuccessMessage("insert");
        }else {
            orderPrintResult.printErrorMessage("insert");
        }
    }

    public void modifyOrder(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        String date = parameter.get("date");
        String time = parameter.get("time");
        int totalPrice = Integer.parseInt(parameter.get("totalPrice"));

        OrderDTO order = new OrderDTO();
        order.setCode(code);
        order.setDate(date);
        order.setTime(time);
        order.setTotalPrice(totalPrice);

        int result = orderService.modifyOrder(order);
        if(result > 0){
            orderPrintResult.printSuccessMessage("update");
        }else {
            orderPrintResult.printErrorMessage("update");
        }
    }

    public void deleteOrder(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("orderCode"));


        int result = orderService.deleteOrder(code);
        if(result > 0){
            orderPrintResult.printSuccessMessage("delete");
        }else {
            orderPrintResult.printErrorMessage("delete");
        }

    }

}
