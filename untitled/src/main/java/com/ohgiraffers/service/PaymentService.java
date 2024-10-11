package com.ohgiraffers.service;

import com.ohgiraffers.common.DTO.PaymentDTO;
import com.ohgiraffers.dao.PaymentMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class PaymentService {

    public static List<PaymentDTO> selectAllPaymentInfo() {

        SqlSession sqlSession = getSqlSession();

        PaymentMapper paymentMapper = sqlSession.getMapper(PaymentMapper.class);

        List<PaymentDTO> paymentList = paymentMapper.selectAllPaymentInfo();

        sqlSession.close();

        return paymentList;

    }
}
