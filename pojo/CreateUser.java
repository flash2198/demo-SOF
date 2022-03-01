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
public class CreateUser {
    @Id
    private Long userId;
    private String userName;
    private String emailId;
    private String password;
}
