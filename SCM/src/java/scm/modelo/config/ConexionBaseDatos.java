
package scm.modelo.config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Juan Carlos Arguello Ortiz
 * @version 1.0
 */

/* Se realiza la conexion a la base de datos */
public class ConexionBaseDatos {
    private final String url = "jdbc:postgresql://localhost:5432/SCM";
    private final String username = "postgres";
    private final String password = "ABC+-*xyz123";
    private DriverManagerDataSource dataSource;

       
    public DriverManagerDataSource getDataSource(){
        dataSource = new DriverManagerDataSource(url, username, password);
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }
}
