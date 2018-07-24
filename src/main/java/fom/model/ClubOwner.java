package fom.model;
/*
 *  Created by griff on 7/23/18 .
 */

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clubOwners")
class ClubOwner extends ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Club club;
    @OneToOne
    private Location currentLocation;
    @OneToMany
    private List<Location> previousLocations;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
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
}
