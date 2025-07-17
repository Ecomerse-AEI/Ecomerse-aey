package com.codeapi.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "collections")

public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "create_at", nullable = false)
    private String createAt;
    @Column(name = "update_at", nullable = false)
    private String updateAt;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_collection_users"))
    private User customer;
    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<CollectionBook> collectionBook;


}
