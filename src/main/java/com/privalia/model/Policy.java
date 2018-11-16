package com.privalia.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@DynamicUpdate(value = true)
@Table(name = "policy")
public class Policy {

    @Id
    private String id;

    private BigDecimal amountInsured;

    private String email;

    private Date inceptionDate;

    private boolean installmentPayment;

    private String clientId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmountInsured() {
        return amountInsured;
    }

    public void setAmountInsured(BigDecimal amountInsured) {
        this.amountInsured = amountInsured;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getInceptionDate() {
        return inceptionDate;
    }

    public void setInceptionDate(Date inceptionDate) {
        this.inceptionDate = inceptionDate;
    }

    public boolean isInstallmentPayment() {
        return installmentPayment;
    }

    public void setInstallmentPayment(boolean installmentPayment) {
        this.installmentPayment = installmentPayment;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
