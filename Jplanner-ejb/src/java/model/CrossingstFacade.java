/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Crossingst;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ak2049l
 */
@Stateless
public class CrossingstFacade extends AbstractFacade<Crossingst> {

    @PersistenceContext(unitName = "Jplanner-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CrossingstFacade() {
        super(Crossingst.class);
    }
    
}
