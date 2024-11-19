package com.example.fuchione.service.Interfaces;

import com.example.fuchione.model.Team;
import com.example.fuchione.model.User;
import com.example.fuchione.response.BasicUserResponse;

public interface UserService  {

    //create
    public BasicUserResponse addUser(User userData);

    //Update
    public BasicUserResponse updateUser (User userData);

    //Read
    public BasicUserResponse getUserById(int id);
    public BasicUserResponse listAllUsers();
    public BasicUserResponse listAllUsersByTeam(Team teamName);



    //delete
    public BasicUserResponse deleteUserById(int id);
}
