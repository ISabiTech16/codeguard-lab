package com.lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRepository {
    private final Connection conn;

    public CustomerRepository(Connection conn) {
        this.conn = conn;
    }

    public ResultSet findByName(String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM customers WHERE name = ?");
        ps.setString(1, name);
        return ps.executeQuery();
    }
}
