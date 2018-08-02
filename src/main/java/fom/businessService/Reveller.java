package fom.businessService;
/*
 *  Created by griff on 7/27/18 .
 */

import fom.model.Club;
import fom.model.Location;
import fom.model.Visit;

import java.util.List;

public interface Reveller {

    public List<Reveller> getNearbyReveller();
    public List<Reveller> getAllRevellers();
    public Location getRevellerLocation();
    public List<Club> getNearbyClubs();
    public List<Visit> getRevellerVisits();
    public List<Club> revellerSuggestions();

}
