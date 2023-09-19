package com.movie.userService.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userService")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private Long Id;
        private String name;
        private String emailId;
        private String location;
        private String password;
}
