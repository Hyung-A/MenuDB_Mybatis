package com.ohgiraffers.service;

import com.ohgiraffers.common.DTO.MenuDTO;
import com.ohgiraffers.dao.MenuMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class MenuService {

    public List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menuList = menuMapper.selectAllMenu();

        sqlSession.close();

        return menuList;
    }
}
