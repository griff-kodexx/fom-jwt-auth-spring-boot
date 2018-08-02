package fom.model;
/*
 *  Created by griff on 7/23/18 .
 */

import fom.util.Gender;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "revellers")
public class Reveller extends ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dob;
    private Gender gender;
    @OneToOne
    private Location currentLocation;
    @OneToMany
    private List<Location> previousLocations;
    @OneToMany
    private List<Visit> visits;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public List<Location> getPreviousLocations() {
        return previousLocations;
    }

    public void setPreviousLocations(List<Location> previousLocations) {
        this.previousLocations = previousLocations;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
}
