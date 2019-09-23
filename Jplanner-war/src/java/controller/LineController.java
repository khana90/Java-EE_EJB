
package controller;

import entity.Line;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import static java.util.Collections.list;
import java.util.List;
import javax.ejb.EJB;
import model.LineFacade;

/**
 *
 * @author ak2049l
 */
@Named(value = "lineController")
@SessionScoped
public class LineController implements Serializable {

    @EJB
    private LineFacade lineFacade;
    private Line l = new Line();

    public Line getL() {
        return l;
    }

    public void setL(Line l) {
        this.l = l;
    }
    
    public LineController() {
    }
    
    public List<Line>findAll(){
        return this.lineFacade.findAll();
    }
    public String addLine(){
        this.lineFacade.create(this.l);
        this.l= new Line();
        return "index";
    }
    public void delete(Line l){
        this.lineFacade.remove(l);
    }
    public String editLine(Line l){
        this.l=l;
        return "editLine";
    }
    public String editLine(){
        this.lineFacade.edit(l);
        return"index";
    }
    
    
}
