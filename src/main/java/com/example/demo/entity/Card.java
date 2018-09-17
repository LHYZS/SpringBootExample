package com.example.demo.entity;

import lombok.Data;

/**
 * @author lihongyu
 */
@Data
public class Card {
    private String imgLink;
    private String title;
    private String content;

    public Card() {
    }

    public Card(String imgLink, String title, String content) {
        this.imgLink = imgLink;
        this.title = title;
        this.content = content;
    }
}
