package com.ohgiraffers.service;

import com.ohgiraffers.common.DTO.OrderDTO;
import com.ohgiraffers.dao.OrderMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class OrderService {

    public List<OrderDTO> selectAllOrder() {
        SqlSession sqlSession = getSqlSession();

//        에러 나는중인데 오타일 확률이 굉장히 높을 듯
//        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

//        List<OrderDTO> orderList = orderMapper.selectAllOrder();
        List<OrderDTO> orderList = null;

        sqlSession.close();

        return orderList;
    }
}
