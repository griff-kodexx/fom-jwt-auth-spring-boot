package fom;
/*
 *  Created by griff on 7/23/18 .
 */

import fom.util.Gender;

import java.util.Date;
import java.util.List;

class Reveller extends User{
    private Date dob;
    private Gender gender;
    private Location currentLocation;
    private List<Location> previousLocations;
    private List<Visit> visits;

}
