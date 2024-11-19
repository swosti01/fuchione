package com.example.fuchione.service;

import com.example.fuchione.model.Team;
import com.example.fuchione.model.User;
import com.example.fuchione.repository.UserRepository;
import com.example.fuchione.response.BasicUserResponse;
import com.example.fuchione.service.Interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

        @Autowired
        private UserRepository userRepository;

        @Override
        public BasicUserResponse addUser(User userData) {

                BasicUserResponse basicUserResponse = new BasicUserResponse(true, "User created",null);

                userRepository.save(userData);

                return basicUserResponse;
        }


        @Override
        public BasicUserResponse updateUser(User userData) {
                BasicUserResponse basicUserResponse = new BasicUserResponse(true, "Update sucessfully", null);
                userRepository.save(userData);
                return basicUserResponse;
        }

        @Override
        public BasicUserResponse getUserById(int id) {
                // Fetch the user by ID as a list (either empty or with one element)
                List<User> userList = userRepository.findById(id);

                if (!userList.isEmpty()) {
                        // User found, return success response
                        return new BasicUserResponse(true, "User retrieved successfully", userList);
                } else {
                        // User not found, return failure response
                        return new BasicUserResponse(false, "User not found with ID: " + id, null);
                }
        }




        @Override
        public BasicUserResponse listAllUsers() {
                return null;
        }

        @Override
        public BasicUserResponse listAllUsersByTeam(Team teamName) {
                return null;
        }

        @Override
        public BasicUserResponse deleteUserById(int id) {
                return null;
        }
}
