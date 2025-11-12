package com.expense.authservice.models;

import com.expense.authservice.entities.UserInfo;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserInfoDto extends UserInfo {
    private String firstName;

    private String lastName;

    private String emailId;

    private Long phoneNumber;
}
