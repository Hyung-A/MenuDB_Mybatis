package com.ohgiraffers.dao;

import com.ohgiraffers.common.DTO.MenuDTO;

import java.util.List;

public interface MenuMapper {

    List<MenuDTO> selectAllMenu();
}
