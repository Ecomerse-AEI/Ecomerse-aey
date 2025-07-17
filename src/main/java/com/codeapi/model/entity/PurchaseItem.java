package com.codeapi.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "purchase")
public class PurchaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Float price;
    @Column(name = "downs_ava")
    private Integer downloadsAvailable;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_purchase_item_book"))
    private Book book;

    @ManyToOne
    @JoinColumn(name = "purchase_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_purchase_item_purchase"))
    private Purchase purchase;

}
