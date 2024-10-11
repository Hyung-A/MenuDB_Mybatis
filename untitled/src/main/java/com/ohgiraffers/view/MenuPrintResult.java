package com.ohgiraffers.view;

import com.ohgiraffers.common.DTO.MenuDTO;

import java.util.List;

public class MenuPrintResult {

    public void printMenuList(List<MenuDTO> menuList) {

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }
    }

    public void errorMesssage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectAllMenu" : errorMessage = "메뉴 테이블의 전체 조회를 실패하였습니다.";
        }

        System.out.println(errorMessage);

    }
}
