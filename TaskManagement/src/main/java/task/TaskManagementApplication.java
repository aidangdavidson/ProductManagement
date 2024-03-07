package task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


import beans.Task;
import task.repository.TaskRepository;

@EntityScan("beans")
@SpringBootApplication
public class TaskManagementApplication implements CommandLineRunner{

	@Autowired
	private TaskRepository taskRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
		
	}
	
	@Override
    public void run(String... args) throws Exception {

        Task task = new Task("Example Task", "This is an example task.", false);
        taskRepo.save(task);

        System.out.println("Task Saved!");
    }

}
