package com.codeapi.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table(name = "collections_books")
@Entity
@IdClass(CollectionBookPK.class)
public class CollectionBook {

    @Id
    private Integer book;

    @Id
    private Integer collection;

    @Column(name = "added_name", nullable = false)
    private LocalDateTime addedDate;
}
