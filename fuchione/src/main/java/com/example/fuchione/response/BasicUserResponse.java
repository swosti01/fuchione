package com.example.fuchione.response;


import com.example.fuchione.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicUserResponse {
    private boolean status;
    private String message;
    private List<User> userList;

}
