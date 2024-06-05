package com.metrodata.initialize_project.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_m_thread")
public class Thread {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UniqueID")
    private Long id;

    @Column(length = 100)
    private String title;

    @Column(length = 50)
    private String slug;

    @Column
    private Integer counter;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate created_at;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate updated_at;

    @OneToMany(mappedBy = "thread_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> post = new ArrayList<Post>();

    @OneToOne(mappedBy = "thread_id", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Vote vote;
}
