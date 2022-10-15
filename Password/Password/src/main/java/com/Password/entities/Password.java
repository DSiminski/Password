package com.Password.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "Passwords")
public class Password {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private UUID Id;

    @Getter @Setter
    @NotNull
    @Column(nullable = false)
    private String Value;

    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;


}
