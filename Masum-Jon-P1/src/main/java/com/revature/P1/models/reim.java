package com.revature.P1.models;
import java.sql.Timestamp;
public class reim {
    private String reim_id;
    private int reim_amount;
    private String description;
    private String receipt_description;
    private String payment_id;
    private String author_name;
    private String resolver_name;
    private String resolver_id;
    private String status_description;
    private String type_description;
    private String date_sumbission;
    private String date_resolved;

    public reim(String reim_id, int reim_amount, String description, String receipt_description, String payment_id, String author_name, String resolver_name, String resolver_id, String status_description, String type_description, String date_sumbission, String date_resolved) {
        this.reim_id = reim_id;
        this.reim_amount = reim_amount;
        this.description = description;
        this.receipt_description = receipt_description;
        this.payment_id = payment_id;
        this.author_name = author_name;
        this.resolver_name = resolver_name;
        this.resolver_id = resolver_id;
        this.status_description = status_description;
        this.type_description = type_description;
        this.date_sumbission = date_sumbission;
        this.date_resolved = date_resolved;
    }

    public String getReim_id() {
        return reim_id;
    }

    public void setReim_id(String reim_id) {
        this.reim_id = reim_id;
    }

    public int getReim_amount() {
        return reim_amount;
    }

    public void setReim_amount(int reim_amount) {
        this.reim_amount = reim_amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReceipt_description() {
        return receipt_description;
    }

    public void setReceipt_description(String receipt_description) {
        this.receipt_description = receipt_description;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getResolver_id() {
        return resolver_id;
    }

    public void setResolver_id(String resolver_id) {
        this.resolver_id = resolver_id;
    }

    public String getStatus_description() {
        return status_description;
    }

    public void setStatus_description(String status_description) {
        this.status_description = status_description;
    }

    public String getType_description() {
        return type_description;
    }

    public void setType_description(String type_description) {
        this.type_description = type_description;
    }

    public String getDate_sumbission() {
        return date_sumbission;
    }

    public void setDate_sumbission(String date_sumbission) {
        this.date_sumbission = date_sumbission;
    }

    public String getDate_resolved() {
        return date_resolved;
    }

    public void setDate_resolved(String date_resolved) {
        this.date_resolved = date_resolved;
    }
}
