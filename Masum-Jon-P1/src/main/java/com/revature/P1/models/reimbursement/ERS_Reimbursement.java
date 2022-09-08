package com.revature.P1.models.reimbursement;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
public class ERS_Reimbursement {
    private String reimbursement_ID;
    private Blob receipt;
    private Timestamp submitted;
    private Timestamp resolution;
    private String description;
    private String payment_ID;
    private String author_ID;
    private String resolver_ID;
    private double amount;
    private String status;
    private String type_id;

    public ERS_Reimbursement(String reimbursement_ID, Blob receipt, Timestamp submitted, Timestamp resolution, String description, String payment_ID, String author_ID, String resolver_ID, double amount, String status, String type_id) {
        this.reimbursement_ID = reimbursement_ID;
        this.receipt = receipt;
        this.submitted = submitted;
        this.resolution = resolution;
        this.description = description;
        this.payment_ID = payment_ID;
        this.author_ID = author_ID;
        this.resolver_ID = resolver_ID;
        this.amount = amount;
        this.status = status;
        this.type_id = type_id;
    }

    public String getReimbursement_ID() {
        return reimbursement_ID;
    }

    public void setReimbursement_ID(String reimbursement_ID) {
        this.reimbursement_ID = reimbursement_ID;
    }

    public Blob getReceipt() {
        return receipt;
    }

    public void setReceipt(Blob receipt) {
        this.receipt = receipt;
    }

    public Timestamp getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Timestamp submitted) {
        this.submitted = submitted;
    }

    public Timestamp getResolution() {
        return resolution;
    }

    public void setResolution(Timestamp resolution) {
        this.resolution = resolution;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    public String getPayment_ID() {
        return payment_ID;
    }

    public void setPayment_ID(String payment_ID) {
        this.payment_ID = payment_ID;
    }

    public String getAuthor_ID() {
        return author_ID;
    }

    public void setAuthor_ID(String author_ID) {
        this.author_ID = author_ID;
    }

    public String getResolver_ID() {
        return resolver_ID;
    }

    public void setResolver_ID(String resolver_ID) {
        this.resolver_ID = resolver_ID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ERSReimbursement{" +
                "reimbursement_ID='" + reimbursement_ID + '\'' +
                ", receipt=" + receipt +
                ", submitted=" + submitted +
                ", resolved=" + resolution +

                ", payment_ID='" + payment_ID + '\'' +
                ", author_ID='" + author_ID + '\'' +
                ", resolver_ID='" + resolver_ID + '\'' +
                ", amount=" + amount +
                '}';
    }
}
