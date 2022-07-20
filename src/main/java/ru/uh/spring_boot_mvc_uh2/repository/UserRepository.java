package ru.uh.spring_boot_mvc_uh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.uh.spring_boot_mvc_uh2.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
