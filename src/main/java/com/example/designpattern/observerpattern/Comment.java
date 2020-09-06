package com.example.designpattern.observerpattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangquanwei
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    /**
     * 评论者昵称
     */
    private String nickname;
    /**
     * 评论内容
     */
    private String value;
}
