import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class BatchJobExecution {
    @Id
    private Long jobInstanceId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private int exitCode;
    private String exitMessage;

    // Getters and setters
}