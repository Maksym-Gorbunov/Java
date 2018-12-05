package app;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB {
    private List<Car> cars = new ArrayList<>();

    private Connection connect() {
        String url = "jdbc:sqlite:C://Java/Transport/data/cars.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public ResultSet selectAllFromCars(){
        String sql = "SELECT make, color, licensenumber FROM cars";
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            return rs;
        } catch (SQLException e) {
            System.out.println("-->" + e.getMessage());
        }
        return null;
    }

    public void selectAll(){
        String sql = "SELECT make, color, licensenumber FROM cars";
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("make") +  "\t" +
                        rs.getString("color") + "\t" +
                        rs.getString("licensenumber"));
            }
        } catch (SQLException e) {
            System.out.println("-->" + e.getMessage());
        }
    }

    public void insert(String make, String color, String licensenumber) {
        String sql = "INSERT INTO cars(make, color, licensenumber) VALUES(?,?,?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, make);
            pstmt.setString(2, color);
            pstmt.setString(3, licensenumber);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void update(String make, String color, String licensenumber, String new_make, String new_color, String new_licensenumber) {
        String sql = "UPDATE cars set make=?, color=?, licensenumber=? WHERE make=? AND color=? AND licensenumber=?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, new_make);
            pstmt.setString(2, new_color);
            pstmt.setString(3, new_licensenumber);
            pstmt.setString(4, make);
            pstmt.setString(5, color);
            pstmt.setString(6, licensenumber);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(String licensenumber){
        String sql = "DELETE FROM cars WHERE licensenumber=?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, licensenumber);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        DB app = new DB();
//
//        app.insert("Ford", "Blue", "TTT 111");
//        app.insert("Peugeot", "Silver", "UML 222");
//        app.insert("Mitsubishi", "Black", "WSD 333");
//
//        app.selectAll();
//
//        System.out.println("_____________________________________________");
//        app.update("Honda", "Blue", "ABC 124", "Honda Accord", "Light Blue", "TTT 777");
//        app.delete("WSD 333");
//        app.selectAll();
//
//
//    }
}
