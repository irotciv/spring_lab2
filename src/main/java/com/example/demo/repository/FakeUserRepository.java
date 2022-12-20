package com.example.demo.repository;

import com.example.demo.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
@Setter
public class FakeUserRepository implements UserRepository{
    private final List<User> users = new ArrayList<>();

    public FakeUserRepository() {
        users.add(new User("John", "Bill"));
        users.add(new User("Bob", "Brown"));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
