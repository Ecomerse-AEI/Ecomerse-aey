package com.codeapi.model.entity;

import com.codeapi.model.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Float total;
    private LocalDate createAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status")
    private PaymentStatus paymentStatus;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_puchase_customer"))
    private User customer;

    @OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL)
    private List<PurchaseItem> items;


}
