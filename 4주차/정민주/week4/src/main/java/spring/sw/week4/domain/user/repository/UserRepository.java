package spring.sw.week4.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.sw.week4.domain.user.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
