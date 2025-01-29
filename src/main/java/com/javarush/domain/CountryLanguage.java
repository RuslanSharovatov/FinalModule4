package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.NumericBooleanConverter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "country_language", schema = "world")
public class CountryLanguage {
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String language;

    @Column(name = "is_official", columnDefinition = "BIT")
    @Convert(converter = NumericBooleanConverter.class)
    private Boolean isOfficial;

    private BigDecimal percentage;
}
