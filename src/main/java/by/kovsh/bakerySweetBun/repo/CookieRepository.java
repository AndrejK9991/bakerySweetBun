package by.kovsh.bakerySweetBun.repo;

import by.kovsh.bakerySweetBun.entity.Cookie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CookieRepository extends JpaRepository<Cookie, Long> {
}
