package com.demoSOF.demoSOF.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Answer {
    @Id
    private Long answerId;
    private Long userId;
    private Long questionId;
    private String answer;
    private int upVoted;
    private int downVoted;
}
