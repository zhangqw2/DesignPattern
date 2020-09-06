package com.example.designpattern.observerpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {

    @Test
    void observerTest(){
        Blog blog = new Blog("java");
        Author author = new Author("test");

        // 添加观察者
        blog.addObserver(author);

        Comment comment = new Comment("guest",
                "感谢分享。");
        blog.comment(comment);
    }

}