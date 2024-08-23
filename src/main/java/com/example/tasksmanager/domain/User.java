package com.example.tasksmanager.domain;


import jakarta.validation.constraints.Email;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class User {
    @Generated
    private Long id;

    @NonNull
    @Generated
    private String name;

    @NonNull
    @Generated
    @Email(message = "E-mail, must to be valid")
    private String email;

    @NonNull
    @Generated
    private String password;


    public User(String name, String email, String password, Long id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public @NonNull Long getId() {
        return id;
    }

    public @NonNull String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public @NonNull String getEmail() {
        return email;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public @NonNull String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }
}


