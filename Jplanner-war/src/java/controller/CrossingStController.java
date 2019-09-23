
package controller;

import entity.Crossingst;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.CrossingstFacade;


@Named(value = "crossingStController")
@SessionScoped
public class CrossingStController implements Serializable {

    @EJB
    private CrossingstFacade crossingstFacade;
    private Crossingst x = new Crossingst();

    public Crossingst getX() {
        return x;
    }

    public void setX(Crossingst x) {
        this.x = x;
    }
    public CrossingStController() {
    }
    
     public List<Crossingst> findAll(){
       return this.crossingstFacade.findAll();
    }
    
    public String addStx(){
        this.crossingstFacade.create(this.x);
        this.x= new Crossingst();
        return"index2";
    }
     public void delete(Crossingst x){
        this.crossingstFacade.remove(x);
    }
    public String editStx(Crossingst x){
        this.x=x;
        return "editStx";
    }
    public String editStx(){
        this.crossingstFacade.edit(x);
        return"index2";
    }
    
}
