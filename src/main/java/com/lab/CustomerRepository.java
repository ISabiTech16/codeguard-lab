package com.lab;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerRepository {
    private final Connection conn;

    public CustomerRepository(Connection conn) {
        this.conn = conn;
    }

    public ResultSet findByName(String name) throws SQLException {
        Statement st = conn.createStatement();
        String query = "SELECT * FROM customers WHERE name = '" + name + "'";
        return st.executeQuery(query);
    }
}
