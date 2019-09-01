package br.com.gucaobianco.graphqlexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * * created by lgcaobianco on 8/31/19
 **/

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String cellphone;

    @ManyToOne
    @JoinColumn
    private Company company;
}
