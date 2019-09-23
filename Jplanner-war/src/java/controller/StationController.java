/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Station;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.StationFacade;

/**
 *
 * @author ak2049l
 */
@Named(value = "stationController")
@SessionScoped
public class StationController implements Serializable {

    @EJB
    private StationFacade station1Facade;
    private Station st= new Station();

    public Station getSt() {
        return st;
    }

    public void setSt(Station st) {
        this.st = st;
    }
   
    public StationController() {
    }
    
    public List<Station> findAll(){
       return this.station1Facade.findAll();
       
    }
    public String addSt(){
        this.station1Facade.create(this.st);
        this.st = new Station();
        return"index";
    }
    public void delete(Station st){
        this.station1Facade.remove(st);
    }
    public String editSt(Station st){
        this.st=st;
        return"editSt";
    }
    public String editSt(){
        this.station1Facade.edit(st);
        return "index";
    }
}
