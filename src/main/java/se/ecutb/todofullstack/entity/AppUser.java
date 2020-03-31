package se.ecutb.todofullstack.entity;

import javax.persistence.*;
import java.time.LocalDate;
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


    public AppUser(){}
}
