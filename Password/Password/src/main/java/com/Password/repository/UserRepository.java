package com.Password.repository;

import com.criptoPassword.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    @Query("FROM User users WHERE users.Id = :userId")
    public List<User> findAllUserPassWords(@Param("userId") UUID userId);

    @Query("FROM User users WHERE users.Id =: userId")
    public String getNameById(@Param("userId") UUID userId);
}
