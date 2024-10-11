package com.ohgiraffers.dao;


import com.ohgiraffers.common.DTO.OrderDTO;

import java.util.List;

public interface OrderMapper {
    List<OrderDTO> selectAllOrder();

    OrderDTO selectOrderByCode(int code);

    int insertOrder(OrderDTO order);

    int modifyOrder(OrderDTO order);
}
