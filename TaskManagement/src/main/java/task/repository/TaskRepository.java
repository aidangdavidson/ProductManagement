package task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beans.Task;

/**
 * @author aidan - agdavidson
 * CIS175 - Spring 2024
 * Mar 4, 2024
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
