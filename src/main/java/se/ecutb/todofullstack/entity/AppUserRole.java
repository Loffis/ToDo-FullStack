package se.ecutb.todofullstack.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AppUserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appUserRoleId;
    @Column(unique = true)
    private String role;

    @ManyToMany(
            mappedBy = "roleSet",
            cascade = {CascadeType.MERGE},
            fetch = FetchType.EAGER
    )
    private Set<AppUser> appUsers;

    public AppUserRole(){}
}
