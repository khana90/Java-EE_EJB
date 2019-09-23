
package controller;

import entity.Line;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.LineFacade;

/**
 *
 * @author ak2049l
 */
@Named(value = "linelistController")
@SessionScoped
public class LinelistController implements Serializable {

    @EJB
    private LineFacade lineFacade;

   
    public LinelistController() {
    }
    
    public List<Line>findAll(){
        return this.lineFacade.findAll();
    }
}
