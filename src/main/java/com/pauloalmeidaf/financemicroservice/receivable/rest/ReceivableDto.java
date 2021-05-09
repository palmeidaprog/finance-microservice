package com.pauloalmeidaf.financemicroservice.receivable.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pauloalmeidaf.financemicroservice.receivable.persistance.Receivable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ReceivableDto {
    private Long id;
    private Date date;
    private String description;
    private Date paymentDate;
    private String installment;
    private Integer installmentNumber;
    private Integer installmentTotal;
    private BigDecimal value;
    private Boolean payed;

    public ReceivableDto(Receivable receivable) {
        this.initializeObject(receivable);
    }

    private void initializeObject(Receivable receivable) {
        this.id = receivable.getId();
        this.date = receivable.getDate();
        this.description = receivable.getDescription();
        this.paymentDate = receivable.getPaymentDate();
        this.installmentTotal = receivable.getInstallmentTotal();
        this.installmentNumber = receivable.getInstallment();
        this.value = receivable.getValue();
        this.payed = receivable.isPayed();

        if (this.installmentNumber != null && this.installmentTotal != null) {
            this.installment = String.format("%d/%d", this.installmentNumber, this.installmentTotal);
        }
    }
}
