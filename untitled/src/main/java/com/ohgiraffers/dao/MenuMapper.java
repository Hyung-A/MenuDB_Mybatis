package com.ohgiraffers.dao;

import com.ohgiraffers.common.DTO.MenuDTO;

import java.util.List;

public interface MenuMapper {

    List<MenuDTO> selectAllMenu();

    int insertMenu(MenuDTO menuDTO);

    int modifyMenu(MenuDTO menuDTO);

    int deleteMenu(int code);
}
