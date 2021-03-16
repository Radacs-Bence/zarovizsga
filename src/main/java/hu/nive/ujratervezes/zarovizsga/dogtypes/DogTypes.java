package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class DogTypes {

    MariaDbDataSource dataSource;

    public DogTypes(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        String countryUppercase = country.toUpperCase();

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT name FROM dog_types WHERE country = ?");
        ) {
            stmt.setString(1, countryUppercase);
            return getStringListFromPreparedStatement(stmt);

        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }

    private List<String> getStringListFromPreparedStatement(PreparedStatement stmt) {
        try (ResultSet rs = stmt.executeQuery()) {
            List<String> searchedDogTypes =new ArrayList<>();
            while (rs.next()) {
                searchedDogTypes.add(rs.getString("name").toLowerCase());
            }
            Collections.sort(searchedDogTypes, Collator.getInstance(new Locale("hu", "HU")));
            return searchedDogTypes;
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }
}
