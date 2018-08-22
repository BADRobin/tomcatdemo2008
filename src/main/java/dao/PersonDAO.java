package dao;

import beans.Person;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class PersonDAO {

    DataSource ds;

    public PersonDAO(DataSource ds) {
        this.ds = ds;
    }

    public List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();
        try (Connection connection = ds.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from person");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                people.add(new Person(id, name, age));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return people;
    }

}