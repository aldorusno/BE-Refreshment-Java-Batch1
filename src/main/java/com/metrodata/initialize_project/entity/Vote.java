package com.metrodata.initialize_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_m_votes")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UniqueID")
    private Long id;

    @Column
    private Integer up_count;

    @Column
    private Integer down_count;

    @OneToOne
    @MapsId
    @JoinColumn(name = "UniqueID")
    private Thread thread_id;
}
