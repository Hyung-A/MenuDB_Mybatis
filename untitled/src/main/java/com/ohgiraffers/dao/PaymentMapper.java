package com.ohgiraffers.dao;

import com.ohgiraffers.common.DTO.PaymentDTO;

import java.util.List;

public interface PaymentMapper {

    List<PaymentDTO> selectAllPaymentInfo();
}
