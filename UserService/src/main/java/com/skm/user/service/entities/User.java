package com.skm.user.service.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "micro_users")
@Builder
public class User {

    @Id
    @Column(name = "ID")
    private  String userId;

    @Column(name = "Name", length = 20)
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "About")
    private String about;

    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
