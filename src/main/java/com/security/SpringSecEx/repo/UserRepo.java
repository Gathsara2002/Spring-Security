package com.security.SpringSecEx.repo;

import com.security.SpringSecEx.model.Student;
import com.security.SpringSecEx.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Gathsara
 * created : 3/4/2025 -- 5:01 PM
 **/

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
