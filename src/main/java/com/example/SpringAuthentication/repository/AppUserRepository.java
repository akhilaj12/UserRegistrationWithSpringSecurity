package com.example.SpringAuthentication.repository;

import com.example.SpringAuthentication.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
}
