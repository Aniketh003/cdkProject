import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BatchJobInstance {
    @Id
    private Long jobInstanceId;
    private String jobName;

    // Getters and setters
}