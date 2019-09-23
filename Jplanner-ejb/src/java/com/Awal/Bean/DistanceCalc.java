
package com.Awal.Bean;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author ak2049l
 */
@Stateless
@LocalBean
public class DistanceCalc {

   public static double distance (double lat1, double lat2, double lon1, double lon2){
       
       final int R= 6371; //Earth Radius
       
       Double latDistance = Math.toRadians(lat2 - lat1);
        Double lonDistance = Math.toRadians(lon2 - lon1);
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c;

        distance = Math.pow(distance, 2);

        return Math.sqrt(distance);
   }
}
