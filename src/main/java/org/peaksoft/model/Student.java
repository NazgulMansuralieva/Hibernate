package org.peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity   //база данныхта таблица бар болуп тузулуш учун жардам берет
@Table(name="test")  //базада тузулгон таблица менен биздин классты байлайт
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name",unique=true)
    private String firstName;

    @Column(name="last_name",length = 50)
    private String lastName;

    private String email;

    private int age;

    public Student(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}
