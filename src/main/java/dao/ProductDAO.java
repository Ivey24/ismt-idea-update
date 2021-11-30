package dao;

import config.JDBCUtils;
import entity.Product;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {


    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        String QUERY = "select * from product ";

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
                String name = rs.getString("name");
                String description = rs.getString("description");
                String price = rs.getString("price");
                int categoryId = rs.getInt("category_id");

                Product product = new Product();

                product.setId(id);
                product.setName(name);
                product.setDescription(description);
                product.setPrice(price);
                product.setCategoryId(categoryId);

                products.add(product);
            }
//            for (Product st : users) {
//                System.out.println(st.getId());
//            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return products;
    }

    public Product findById(int id) {
        Product product = null;

        final String QUERY = "select * from product where id =?";

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
                int productId = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String price = rs.getString("price");
                int categoryId = rs.getInt("category_id");
//                System.out.println(id + "," + name + "," + email + "," + country + "," + password);

                product = new Product(productId, name, price,description, categoryId);

            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return product;
    }

    public void delete(int id) {
        String QUERY = "delete from product where id=? ";
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

    public void update( Product product) {
        // Step 1: Establishing a Connection
        String UPDATE_USERS_SQL = "update product set id=?, name=?, description=?,price=?, category_id=? where id=?;";
        try (Connection connection = JDBCUtils.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setString(4, product.getPrice());
            preparedStatement.setInt(5, product.getCategoryId());

            preparedStatement.setInt(6, product.getId());



            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            JDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}


