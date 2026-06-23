package br.com.etechoracio.ingresso.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "sessao")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "horario")
    private LocalTime horario;

    @Column(name = "preco")
    private Double preco;

    @Column(name = "sala")
    private String sala;

    @ManyToOne
    @JoinColumn(name = "ID_FILME")
    private Filme filme;

}
