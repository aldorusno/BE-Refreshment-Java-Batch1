package com.metrodata.initialize_project.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_m_articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UniqueID")
    private Long id;

    @Column(length = 100)
    private String title;

    @Column(length = 50)
    private String slug;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(columnDefinition = "TEXT")
    private String banner;

    @Column(columnDefinition = "TEXT")
    private String image;

    public enum Type {
        Artikel, Informasi, Promosi
    }

    public enum Status {
        Published, Draft, Deleted
    }

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(columnDefinition = "TINYINT")
    private Integer is_slide_show;

    @Column
    private Integer counter;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate created_at;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate updated_at;

    @OneToMany(mappedBy = "article_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ArticleCategory> articlecategory = new ArrayList<ArticleCategory>();

}
