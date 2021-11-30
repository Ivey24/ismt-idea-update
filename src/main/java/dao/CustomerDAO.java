package dao;

import config.JDBCUtils;
import entity.Category;
import entity.Customer;
import entity.Product;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {


    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        String QUERY = "select * from customer";

        try (Connection connection = JDBCUtils.getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
            // preparedStatement.setInt(1, 1);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt(1);
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                Customer customer = new Customer();
                customer.setId(id);
                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setAddress(address);
                customer.setEmail(email);
                customer.setPhone(phone);

                customers.add(customer);
            }
//            for (Product st : users) {
//                System.out.println(st.getId());
//            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return customers;
    }

    public Customer findById(int id) {
        Customer customer = null;

        final String QUERY = "select * from users where id =?";

        try (Connection connection = JDBCUtils.getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                // rs.next();
                int customerid = rs.getInt("id");
                String fname = rs.getString("firstName");
                String lname = rs.getString("lastName");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String phone = rs.getString("phone");

                customer =new Customer(customerid,fname,lname,address,email,phone);

            }

        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return customer;
    }

    public void delete(int id) {
        String QUERY = "delete from customer where id=? ";
        try (Connection connection = JDBCUtils.getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, id);
            // preparedStatement.setInt(1, 1);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
    }
    public void create(Product user) {


        final String INSERT_USERS_SQL = "INSERT INTO users" +
                "  (id, name, email, country, password) VALUES " +
                " (?, ?, ?, ?, ?);";
        try (Connection connection = JDBCUtils.getConnection();


             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getName());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            JDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }

    public void update(Customer customer) {
        // Step 1: Establishing a Connection
        String UPDATE_USERS_SQL = "update customer set id=?, first_name=?, last_name=?,address=?, email=?, phone=? where id=?;";
        try (Connection connection = JDBCUtils.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            preparedStatement.setInt(7, customer.getId());
            preparedStatement.setString(2, customer.getFirstName());
            preparedStatement.setString(5, customer.getEmail());
            preparedStatement.setInt(1, customer.getId());
            preparedStatement.setString(4, customer.getAddress());
            preparedStatement.setString(3, customer.getLastName());
            preparedStatement.setString(6, customer.getPhone());

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            JDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}


