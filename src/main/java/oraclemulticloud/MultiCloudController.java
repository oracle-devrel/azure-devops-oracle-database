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

    @CrossOrigin
    @GetMapping("/teststring")
    public String teststring() throws Exception {
        return "teststring";
    }
    @CrossOrigin
    @GetMapping("/test")
    public String test() throws Exception {
        String  url = "jdbc:oracle:thin:@config-azure:multicloud-app-config?key=/multicloudapp/";
        OracleDataSource ds = new OracleDataSource();
        ds.setURL(url);
        System.out.println("Connection URL: " + url);
        Connection cn = ds.getConnection();
        Statement st = cn.createStatement();
        String returnString = cn + " ";
        ResultSet rs = st.executeQuery("SELECT 'Hello, db' FROM sys.dual");
        if (rs.next()) returnString+= "asdf" + rs.getString(1) + " : ";
        return "got the conn :" + returnString;
    }

}



