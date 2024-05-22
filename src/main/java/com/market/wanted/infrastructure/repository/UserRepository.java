package com.market.wanted.infrastructure.repository;

import com.market.wanted.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
