package com.demoSOF.demoSOF.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Question {
    @Id
    private Long questionId;
    private Long userId;
    private String questionAsked;
    private List<String> category;
    private int upVoted;
    private int downVoted;
    private boolean isQuestionResolved;
}
