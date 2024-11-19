package com.example.fuchione.repository;

import com.example.fuchione.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    List<User> findById(int id);
}
