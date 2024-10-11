package com.ohgiraffers.service;

import com.ohgiraffers.common.DTO.OrderDTO;
import com.ohgiraffers.dao.OrderMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class OrderService {

    public List<OrderDTO> selectAllOrder() {
        SqlSession sqlSession = getSqlSession();


        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        List<OrderDTO> orderList = orderMapper.selectAllOrder();

        sqlSession.close();

        return orderList;
    }

    public OrderDTO selectOrderByCode(int code) {
        SqlSession sqlSession = getSqlSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        OrderDTO order = orderMapper.selectOrderByCode(code);

        sqlSession.close();

        return order;
    }

    public int insertOrder(OrderDTO order) {
        SqlSession sqlSession = getSqlSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        int result = orderMapper.insertOrder(order);

        if(result > 0) {
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int modifyOrder(OrderDTO order) {
        SqlSession sqlSession = getSqlSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        int result = orderMapper.modifyOrder(order);

        if(result > 0) {
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int deleteOrder(int code) {
        SqlSession sqlSession = getSqlSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        int result = orderMapper.deleteOrder(code);

        if(result > 0) {
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }
}
