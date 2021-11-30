package dao;

import config.JDBCUtils;
import entity.Category;
import entity.Order;
import entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {


    public List<Order> findAll() {
        List<Order> orders = new ArrayList<>();
        final String QUERY = "select * from order";

        try (Connection connection = JDBCUtils.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
            // preparedStatement.setInt(1, 1);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();


            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String ordername = rs.getString("order_number");
                Double total = rs.getDouble("total");
                String dinfo = rs.getString("delivery_info");

                Order order = new Order();

                order.setId(id);
                order.setOrderNumber(ordername);
                order.setTotal(total);
                order.setDeliveryInfo(dinfo);
                orders.add(order);
            }
//            for (Orders st : orders) {
//                System.out.println(st.getId());
//            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return orders;
    }

    public Product findById() {
        Product user = null;

        final String QUERY = "select id,name,email,country,password from users where id =?";

        try (Connection connection = JDBCUtils.getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
            preparedStatement.setInt(1, 1);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                // rs.next();
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                String password = rs.getString("password");
                System.out.println(id + "," + name + "," + email + "," + country + "," + password);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return user;
    }

    public void delete(int id) {
        String QUERY = "delete from users where id=? ";
        try (Connection connection = JDBCUtils.getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, 2);
            // preparedStatement.setInt(1, 1);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();

            // Step 4: Process the ResultSet object.
         /*  while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                String password = rs.getString("password");
                System.out.println(id + "," + name + "," + email + "," + country + "," + password);
           }*/
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        // Step 4: try-with-resource statement will auto close the connection.
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

    public void update(Product user) {
        // Step 1: Establishing a Connection
        String UPDATE_USERS_SQL = "update student set phone=? , email=? where id=?;";
        try (Connection connection = JDBCUtils.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            preparedStatement.setInt(1, user.getId());

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            JDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}


