package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;

public interface UserReposritory extends JpaRepository<User, Integer>{

}
