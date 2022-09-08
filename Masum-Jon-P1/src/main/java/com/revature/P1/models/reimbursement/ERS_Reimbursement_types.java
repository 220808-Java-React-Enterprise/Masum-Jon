package com.revature.P1.models.reimbursement;

public class ERS_Reimbursement_types {
    private String type;
    private String type_id;

    public ERS_Reimbursement_types(String type, String type_id) {
        this.type = type;
        this.type_id = type_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    @Override
    public String toString() {
        return "ERS_Reimbursement_types{" +
                "type='" + type + '\'' +
                ", type_id='" + type_id + '\'' +
                '}';
    }
}
