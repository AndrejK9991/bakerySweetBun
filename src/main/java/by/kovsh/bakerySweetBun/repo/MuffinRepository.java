package by.kovsh.bakerySweetBun.repo;

import by.kovsh.bakerySweetBun.entity.Muffin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuffinRepository extends JpaRepository<Muffin, Long> {
}
