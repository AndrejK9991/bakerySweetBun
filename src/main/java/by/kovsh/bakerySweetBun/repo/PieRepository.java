package by.kovsh.bakerySweetBun.repo;

import by.kovsh.bakerySweetBun.entity.Pie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieRepository extends JpaRepository<Pie, Long> {
}
