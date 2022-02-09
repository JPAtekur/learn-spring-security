package com.learn;

import com.learn.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser,String> {

    AppUser findByUsername(String username);
}
