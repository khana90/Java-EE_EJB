package com.awal.Bean;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author ak2049l
 */
@Stateless
@LocalBean
public class DistanceBean {

int stid;
int distanceid;

    public DistanceBean() {
    }

    public int getDistanceid() {
        return distanceid;
    }

    public void setDistanceid(int distanceid) {
        this.distanceid = distanceid;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }
    

   
}
