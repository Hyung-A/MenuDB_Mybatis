package com.ohgiraffers.view;

import com.ohgiraffers.common.DTO.MenuDTO;

import java.util.List;

public class MenuPrintResult {

    public void printMenuList(List<MenuDTO> menuList) {

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectAllMenu" : errorMessage = "메뉴 테이블의 전체 조회를 실패하였습니다.";
            case "insert" : errorMessage = "신규 메뉴 등록을 실패하였습니다."; break;
            case "modify" : errorMessage = "메뉴 수정을 실패하였습니다."; break;
            case "delete" : errorMessage = "메뉴 삭제를 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "신규 메뉴 등록을 성공하였습니다."; break;
            case "modify" : successMessage = "메뉴 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "메뉴 삭제를 성공하였습니다."; break;

        }

        System.out.println(successMessage);
    }
}
