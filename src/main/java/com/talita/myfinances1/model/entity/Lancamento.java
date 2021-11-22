package com.talita.myfinances1.model.entity;

import com.talita.myfinances1.model.enums.StatusLancamento;
import com.talita.myfinances1.model.enums.TypeLancamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
//import lombok.NoArgsConstructor;

import lombok.NoArgsConstructor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "lancamento", schema="finances")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")//indicates the name of the column
    private Long id;

    @Column(name="description")
    private String description;

    @Column(name="month")
    private Integer month;

    @Column(name="year")
    private Integer year;

    @ManyToOne //It's required to use the notation related to the relationship, this class (many) to the User class (one)
               //many lancamentos can be made by one user
    @JoinColumn(name="id_user")
    private User user;

    @Column(name = "value")
    private BigDecimal value;

    @Column(name="postdata_date")
    //this version of hibernate does not work with the data API of java 8, but JPA offers this converters
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate postdataDate;

    @Column(name="type")
    @Enumerated(value= EnumType.STRING)
    private TypeLancamento type;

    @Column(name="status")
    @Enumerated(value= EnumType.STRING)
    private StatusLancamento status;


}
