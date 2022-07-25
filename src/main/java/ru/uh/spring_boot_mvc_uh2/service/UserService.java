package ru.uh.spring_boot_mvc_uh2.service;

import ru.uh.spring_boot_mvc_uh2.model.User;

import java.util.List;

public interface UserService {

//    public void add(User user);

    public User findById(long id);

    public User saveUser(User user);

    public void deleteById(Long id);

    public List<User> findAll();

}
