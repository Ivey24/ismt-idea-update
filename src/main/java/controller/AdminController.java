package controller;


import dao.*;
import entity.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This servlet program is used to print "Hello World" on
 * client browser using annotations.
 */
//TODO :  email too long  --resolved
//TODO :  edit user    --resolved







@WebServlet(urlPatterns = {"/admin", "/users", "/createUser", "/viewUser", "/deleteUser", "/editUser","/category","/updateusers","/viewcategory"
,"/deletecategory","/editcategory","/createcategory","/updatecategory","/order","/customer","/product","/viewproduct","/editproduct","/updateproduct"
,"/deleteproduct","/editcustomer","/viewcustomer","/deletecustomer","/updatecustomer"})
public class AdminController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    UserDAO userDAO = new UserDAO();
    CategoryDAO categoryDAO = new CategoryDAO();
    OrderDAO orderDAO = new OrderDAO();
    CustomerDAO customerDAO = new CustomerDAO();
    ProductDAO productDAO = new ProductDAO();

    //no-argument constructor
    public AdminController() {

    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        System.out.println(path);
        RequestDispatcher view = null;

        if (path.equals("/admin")) {

            view = request.getRequestDispatcher("admin/admin.jsp");
            view.forward(request, response);

        }
        if (path.equals("/createUser")) {


            view = request.getRequestDispatcher("admin/create-user.jsp");
            view.forward(request, response);

        }
        if (path.equals("/createcategory")) {


            view = request.getRequestDispatcher("admin/create-category.jsp");
            view.forward(request, response);

        }

        if (path.equals("/editUser")) {
            String id = request.getParameter("id");

            User user=userDAO.findById(Integer.parseInt(id));

            request.setAttribute("user",user );
            view = request.getRequestDispatcher("admin/edit-user.jsp");
            view.forward(request, response);

        }
        if (path.equals("/viewUser")) {


            int id = Integer.parseInt(request.getParameter("id"));
            User user = userDAO.findById(id);
            request.setAttribute("ourUser", user);
            view = request.getRequestDispatcher("admin/view-user.jsp");
            view.forward(request, response);

        }
        if (path.equals("/deleteUser")) {


            int id = Integer.parseInt(request.getParameter("id"));
            userDAO.delete(id);

            response.sendRedirect("/users");


        }
        if (path.equals("/users")) {

            List<User> users = userDAO.findAll();
            request.setAttribute("usersList", users);
            view = request.getRequestDispatcher("admin/users.jsp");
            view.forward(request, response);

        }
        if (path.equals("/category")) {

            List<Category> categorys = categoryDAO.findAll();
            request.setAttribute("categorylist", categorys);
            view = request.getRequestDispatcher("admin/category.jsp");
            view.forward(request, response);

        }
        if (path.equals("/viewcategory")) {


            int id = Integer.parseInt(request.getParameter("id"));
            Category category = categoryDAO.findById(id);
            request.setAttribute("ourCategory", category);
            view = request.getRequestDispatcher("admin/view-category.jsp");
            view.forward(request, response);
        }
        if (path.equals("/deletecategory")) {


            int id = Integer.parseInt(request.getParameter("id"));
            categoryDAO.delete(id);

            response.sendRedirect("/category");

        }
        if (path.equals("/editcategory")) {
            String id = request.getParameter("id");

            Category category = categoryDAO.findById(Integer.parseInt(id));

            request.setAttribute("category",category );
            view = request.getRequestDispatcher("admin/edit-category.jsp");
            view.forward(request, response);

        }
        if (path.equals("/order")) {

            List<Order> orders = orderDAO.findAll();
            request.setAttribute("orderList", orders);
            view = request.getRequestDispatcher("admin/order.jsp");
            view.forward(request, response);

        }

        if (path.equals("/customer")) {

            List<Customer> customers = customerDAO.findAll();
            request.setAttribute("customerList", customers);
            view = request.getRequestDispatcher("admin/customer.jsp");
            view.forward(request, response);

        }
        if (path.equals("/viewcustomer")) {


            int id = Integer.parseInt(request.getParameter("id"));
            Customer customer = customerDAO.findById(id);
            request.setAttribute("customer", customer);
            view = request.getRequestDispatcher("admin/view-customer.jsp");
            view.forward(request, response);
        }
        if (path.equals("/deletecustomer")) {


            int id = Integer.parseInt(request.getParameter("id"));
            customerDAO.delete(id);

            response.sendRedirect("/customer");

        }
        if (path.equals("/editcustomer")) {
            String id = request.getParameter("id");

            Customer customer = customerDAO.findById(Integer.parseInt(id));

            request.setAttribute("customer",customer );
            view = request.getRequestDispatcher("admin/edit-customer.jsp");
            view.forward(request, response);

        }
        if (path.equals("/product")) {

            List<Product> products = productDAO.findAll();
            request.setAttribute("productList", products);
            view = request.getRequestDispatcher("admin/product.jsp");
            view.forward(request, response);

        }
        if (path.equals("/viewproduct")) {


            int id = Integer.parseInt(request.getParameter("id"));
            Product product = productDAO.findById(id);
            request.setAttribute("viewproduct", product);
            view = request.getRequestDispatcher("admin/view-product.jsp");
            view.forward(request, response);
        }
        if (path.equals("/editproduct")) {
            String id = request.getParameter("id");

            Product product = productDAO.findById(Integer.parseInt(id));

            request.setAttribute("product",product );
            view = request.getRequestDispatcher("admin/edit-product.jsp");
            view.forward(request, response);

        }
        if (path.equals("/deleteproduct")) {


            int id = Integer.parseInt(request.getParameter("id"));
            productDAO.delete(id);

            response.sendRedirect("/product");

        }


    }

//    private List<User> runthis() {
//        List<User> students = new ArrayList<>();
//        // using try-with-resources to avoid closing resources (boiler plate code)
//
//        // Step 1: Establishing a Connection
//        try (Connection connection = JDBCUtils.getConnection();
//
//             // Step 2:Create a statement using connection object
//             PreparedStatement preparedStatement = connection.prepareStatement("select * from student");) {
//            // preparedStatement.setInt(1, 1);
//            System.out.println(preparedStatement);
//            // Step 3: Execute the query or update query
//            ResultSet rs = preparedStatement.executeQuery();
//
//
//            // Step 4: Process the ResultSet object.
//            while (rs.next()) {
//                int id = rs.getInt(1);
//                String firstName = rs.getString(2);
//                String lastName = rs.getString("last_name");
//                String email = rs.getString("email");
//                String phone = rs.getString("phone");
//                User user = new User();
//                user.setId(id);
//                user.setEmail(email);
//                user.setPhone(phone);
//                students.add(user);
//            }
//
//        } catch (SQLException e) {
//            JDBCUtils.printSQLException(e);
//        }
//        return students;
//        // Step 4: try-with-resource statement will auto close the connection.
//    }


    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        System.out.println(path);

        if (request.getServletPath().equals("/createUser")) {


            String name = request.getParameter("name");

            String email = request.getParameter("email");

            String phone = request.getParameter("phone");

            String username = request.getParameter("username");

            String password = request.getParameter("password");


            boolean isActive = Boolean.parseBoolean(request.getParameter("isActive"));


            User user = new User(name, email, phone, username, password, isActive);


            userDAO.create(user);


            System.out.println("I am here");


            response.sendRedirect("/users");

        }
        if (request.getServletPath().equals("/updateusers")) {

            int id = Integer.parseInt(request.getParameter("id"));

            String name = request.getParameter("name");

            String email = request.getParameter("email");

            String phone = request.getParameter("phone");

            String username = request.getParameter("username");

            String password = request.getParameter("password");

            boolean isActive = Boolean.parseBoolean(request.getParameter("isActive"));

            User user = new User(id, name, email, phone, username, password, isActive);

            userDAO.update(user);

            response.sendRedirect("/users");

        }
        if (request.getServletPath().equals("/createcategory")) {

            int id = Integer.parseInt(request.getParameter("id"));

            String name = request.getParameter("name");

            String email = request.getParameter("description");


            Category category = new Category(id,   name, email);


            categoryDAO.create(category);


            System.out.println("I am here");


            response.sendRedirect("/category");

        }
        if (request.getServletPath().equals("/updatecategory")) {

            int id = Integer.parseInt(request.getParameter("id"));

            String name = request.getParameter("name");

            String email = request.getParameter("description");


            Category category = new Category(id, name, email);

            categoryDAO.update(id, category);

            response.sendRedirect("/category");

        }
        if (request.getServletPath().equals("/updateproduct")) {

            int id = Integer.parseInt(request.getParameter("id"));

            String name = request.getParameter("name");

            String description = request.getParameter("description");

            String price = request.getParameter("price");

            int categoryid = Integer.parseInt(request.getParameter("category_id"));

            Product product = new Product(id, name, price, description,categoryid);
            System.out.println(product);

            productDAO.update(product);

            response.sendRedirect("/product");

        }
        if (request.getServletPath().equals("/updatecustomer")) {

            int id = Integer.parseInt(request.getParameter("id"));

            String fname = request.getParameter("first_name");

            String lname = request.getParameter("last_name");

            String address = request.getParameter("address");

            String email = request.getParameter("email");

            String phone = request.getParameter("phone");

            Customer customer = new Customer(id, fname, lname, address, phone);

            customerDAO.update(customer);

            response.sendRedirect("/customer");

        }
    }

    @Override
    protected void doDelete(HttpServletRequest request,
                            HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        System.out.println(path);

        if (request.getServletPath().equals("/createUser")) {

            System.out.println("I am here");


            RequestDispatcher view = request.getRequestDispatcher("success.jsp");
            view.forward(request, response);

        }
    }


    @Override
    protected void doPut(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        System.out.println(path);

        if (request.getServletPath().equals("/editUser")) {


            RequestDispatcher view = request.getRequestDispatcher("success.jsp");
            view.forward(request, response);

        }
    }
}

