package fom;
/*
 *  Created by griff on 7/23/18 .
 */

import fom.util.Gender;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
class Reveller extends ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dob;
    private Gender gender;
    private Location currentLocation;
    private List<Location> previousLocations;
    private List<Visit> visits;

}
