package com.pauloalmeidaf.financemicroservice.receivable.persistance;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "receivable")
@Data
@NoArgsConstructor
public class Receivable {

    @Id
    private Long id;

    @Column(name = "person_id", nullable = false)
    private Long personId;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false, columnDefinition = "bit")
    private boolean payed;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(nullable = false)
    private BigDecimal value;

    @Column
    private Integer installment;

    @Column(name = "installment_total")
    private Integer installmentTotal;

}
