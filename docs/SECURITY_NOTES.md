# Security notes

Never build SQL by concatenating request values. This is the pattern to avoid:

```java
public ResultSet findByName(String name) throws SQLException {
    Statement st = conn.createStatement();
    String query = "SELECT * FROM customers WHERE name = '" + name + "'";
    return st.executeQuery(query);
}
```

Use a `PreparedStatement` with a `?` placeholder instead. The same goes for shell commands built with
`Runtime.getRuntime().exec(new String[] {"sh", "-c", "tar czf " + archiveName})`.
