package jpabook_v2.jpashop_v2.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {
    //item 공통 속성
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    //책 관련 속성
    private String author;
    private String isbn;

}
