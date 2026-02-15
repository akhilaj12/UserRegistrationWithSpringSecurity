package com.example.SpringAuthentication.repository;

import com.example.SpringAuthentication.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
}
