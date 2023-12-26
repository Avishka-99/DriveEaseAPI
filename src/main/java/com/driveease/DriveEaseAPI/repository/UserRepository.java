package com.driveease.DriveEaseAPI.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.driveease.DriveEaseAPI.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "SELECT * FROM user WHERE user_id = ?1",nativeQuery = true)
    User findUserById(Integer userId);

    
}