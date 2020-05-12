package domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String projectIdentifier;
    private String projectName;
    private String description;
    private Date startDate;
    private Date updateDate;

    public Project() {
    }

    @PrePersist
    protected void onInsert() {
        startDate = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updateDate = new Date();
    }

}
