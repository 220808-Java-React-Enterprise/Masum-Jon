package com.revature.P1.daos;

import com.revature.P1.models.Users.ERS_Users;
import com.revature.P1.utils.ConnectionFactory;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;
public class User_Daos {

    public void save(ERS_Users obj) {
        try (Connection con = ConnectionFactory.getInstance().getConnection()) {
            PreparedStatement ps = con.prepareStatement("INSERT INTO ers_users (user_id, username, email, password, given_name, surname, is_active, role_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            UUID uuid = UUID.randomUUID();
            String uuidAsString = uuid.toString();
            ps.setString(1, uuidAsString);
            ps.setString(2, obj.getUsername());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getPassword());
            ps.setString(5, obj.getGiven_name());
            ps.setString(6, obj.getSurname());
            ps.setBoolean(7, obj.getIs_active());
            ps.setString(8, obj.getRole_id());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public void update(ERS_Users obj) {
        try (Connection con = ConnectionFactory.getInstance().getConnection()) {
            PreparedStatement ps = con.prepareStatement("UPDATE ers_users SET username = ?, email = ?, password = ?, given_name = ?, surname = ?, is_active = ?, role_id = ? WHERE username = ?");
            ps.setString(1, obj.getUsername());
            ps.setString(2, obj.getEmail());
            ps.setString(3, obj.getPassword());
            ps.setString(4, obj.getGiven_name());
            ps.setString(5, obj.getSurname());
            ps.setBoolean(6, obj.getIs_active());
            ps.setString(7, obj.getRole_id());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public void delete(ERS_Users user) throws SQLException {
        try (Connection con = ConnectionFactory.getInstance().getConnection()) {
            PreparedStatement ps = con.prepareStatement("DELETE FROM ers_users WHERE username=?");
            ps.setString(1, user.getUsername());
            ps.executeUpdate();
        }

    }

    public ERS_Users getUserByUsernameAndPassword(String username, String password) {
        /*try (Connection con = ConnectionFactory.getInstance().getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM masumjon WHERE username = ? and \"password\" = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next())
                return new user(rs.getString("user_id"), rs.getString("username"), rs.getString("password"));


} catch (SQLException e) {
            throw new RuntimeException(e);*/
        return null;
    }





}

