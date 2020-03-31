package se.ecutb.todofullstack.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(unique = true)
    private String userName;
    private String firstName;
    private String lastName;
    private LocalDate regDate;
    private String password;
    private double balance;

    @ManyToMany(
            cascade = {CascadeType.MERGE},
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "app_user_app_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "app_user_role_id")
    )
    private Set<AppUserRole> roleSet;

    @OneToMany(mappedBy = "assignee", orphanRemoval = false, fetch = FetchType.EAGER,
    cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE}
    )
    private Set<TodoItem> todoItems;

    public AppUser(){}
}
