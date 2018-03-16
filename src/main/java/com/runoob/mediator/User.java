package com.runoob.mediator;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String name;

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
