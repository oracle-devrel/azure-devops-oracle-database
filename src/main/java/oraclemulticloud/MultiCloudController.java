package oraclemulticloud;

import java.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import oracle.jdbc.pool.OracleDataSource;

import javax.sql.DataSource;

@RestController
@RequestMapping("/data")
public class MultiCloudController {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public MultiCloudController(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @GetMapping("/teststring")
    public String teststring() throws Exception {
        return "teststring";
    }

    @GetMapping("/test")
    public String test() throws Exception {
        String  url = "jdbc:oracle:thin:@config-azure:multicloud-app-config?key=/multicloudapp/";
        OracleDataSource ds = new OracleDataSource();
        ds.setURL(url);
        System.out.println("Connection URL: " + url);
        Connection cn = ds.getConnection();
        Statement st = cn.createStatement();
        String returnString = cn + " ";
//      Replace with "SELECT 'Hello, db' FROM sys.dual" if cicd_test_table doesn't exist or any other applicable SQL
        ResultSet rs = st.executeQuery("SELECT * FROM cicd_test_table");
        if (rs.next()) returnString+= "value = " + rs.getString(1) + " : ";
        return "got the conn :" + returnString;
    }

}



