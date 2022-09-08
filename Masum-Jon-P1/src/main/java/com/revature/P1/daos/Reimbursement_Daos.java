package com.revature.P1.daos;
import com.revature.P1.models.reimbursement.*;
import com.revature.P1.models.Users.ERS_Users;
import com.revature.P1.utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class Reimbursement_Daos {
    public void save(ERS_Reimbursement obj) {
        try (Connection con = ConnectionFactory.getInstance().getConnection()) {
            PreparedStatement ps = con.prepareStatement("INSERT INTO ers_reimbursements (reimb_id, amount, submitted, resolved, description, receipt, payment_id, author_id, resolver_id, status_id, type_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            UUID uuid = UUID.randomUUID();
            String uuidAsString = uuid.toString();
            ps.setString(1, uuidAsString);
            ps.setDouble(2, obj.getAmount());
            ps.setTimestamp(3, obj.getSubmitted());
            ps.setTimestamp(4, obj.getResolution());
            ps.setString(5, obj.getDescription());
            ps.setBlob(6, obj.getReceipt());
            ps.setString(7, obj.getPayment_ID());
            ps.setString(8, obj.getAuthor_ID());
            ps.setString(9,obj.getResolver_ID());
            ps.setString(10,obj.getStatus());
            ps.setString(11,obj.getType_id());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        }
    }


