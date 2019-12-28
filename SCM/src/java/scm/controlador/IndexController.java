
package scm.controlador;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import scm.modelo.Usuario;
import scm.modelo.config.ConexionBaseDatos;


/**
 * 
 * @author Juan Carlos Arguello
 * @version 1.0
 */

@Controller
public class IndexController {
    private final JdbcTemplate jdbcTemplate;

    public IndexController() {
        ConexionBaseDatos conexion = new ConexionBaseDatos();
        jdbcTemplate = new JdbcTemplate(conexion.getDataSource());
    }
    
    @RequestMapping(value = "/index.htm", method = RequestMethod.POST)
    public ModelAndView index(@RequestParam("usuario") String uString,
            @RequestParam("password") String pString ){
        if(uString.equals("admin") && pString.equals("admin")){
            ModelAndView mav = new ModelAndView();
            String sql = "SELECT * FROM permisos";
            List datos = jdbcTemplate.queryForList(sql);
            mav.setViewName("index");
            mav.addObject("datos", datos ); 
            return mav; 
        }else{
            ModelAndView mav = new ModelAndView();
            mav.setViewName("login");
            return mav; 
        }
        
    }
    
   
   
}
