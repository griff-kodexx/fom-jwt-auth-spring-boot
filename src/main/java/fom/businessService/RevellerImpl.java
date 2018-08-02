package fom.businessService;
/*
 *  Created by griff on 7/27/18 .
 */

import fom.model.Club;
import fom.model.Location;
import fom.model.Visit;
import org.springframework.context.annotation.Bean;

import java.util.List;


public class RevellerImpl implements Reveller {
    @Override
    public List<Reveller> getNearbyReveller() {
        return null;
    }

    @Override
    public List<Reveller> getAllRevellers() {
        return null;
    }

    @Override
    public Location getRevellerLocation() {
        return null;
    }

    @Override
    public List<Club> getNearbyClubs() {
        return null;
    }

    @Override
    public List<Visit> getRevellerVisits() {
        return null;
    }

    @Override
    public List<Club> revellerSuggestions() {
        return null;
    }
}
