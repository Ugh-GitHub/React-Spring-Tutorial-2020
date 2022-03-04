package net.javaguides.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootbackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
