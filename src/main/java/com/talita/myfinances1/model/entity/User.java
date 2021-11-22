package com.talita.myfinances1.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;




@Entity/*JPA Notation to recognize the class as an entity from database*/
@Table (name = "user" , schema = "finances")/*Table name and schema name*/
@Builder
@Data

@NoArgsConstructor//this was needed for correct the error*****
@AllArgsConstructor
public class User {

    /* methods equals and hashCode are necessary to work with lists for comparison of elements*/

    @Id //primary key notation REQUIRED
    @Column(name = "id")//indicates the column name on the database
    @GeneratedValue (strategy = GenerationType.IDENTITY)//for big serial use identity, this way the database will create the identity string
    private long id;

    @Column(name = "name")
    private String name;


    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}
