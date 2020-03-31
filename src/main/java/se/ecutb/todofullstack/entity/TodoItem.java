package se.ecutb.todofullstack.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int todoItemId;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean isDone;
    private double reward;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REMOVE})
    @JoinColumn(name = "user_id")
    private AppUser assignee;

    public TodoItem(){}
}
