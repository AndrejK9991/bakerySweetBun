package by.kovsh.bakerySweetBun.repo;

import by.kovsh.bakerySweetBun.entity.FreshBread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreshBreadRepository extends JpaRepository<FreshBread, Long> {
}
