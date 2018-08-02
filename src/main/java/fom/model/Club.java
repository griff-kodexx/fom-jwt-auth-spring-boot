package fom.model;
/*
 *  Created by griff on 7/23/18 .
 */

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Location clubLocation;
    @OneToMany
    private List<Event> events;
    @OneToMany
    private List<Deal> deals;
    @OneToOne
    private ClubDetails clubDetails;
    @OneToOne
    private ClubOwner clubOwner;
    @OneToMany
    private List<Visit> clubVisits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Location getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(Location clubLocation) {
        this.clubLocation = clubLocation;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    public ClubDetails getClubDetails() {
        return clubDetails;
    }

    public void setClubDetails(ClubDetails clubDetails) {
        this.clubDetails = clubDetails;
    }

    public ClubOwner getClubOwner() {
        return clubOwner;
    }

    public void setClubOwner(ClubOwner clubOwner) {
        this.clubOwner = clubOwner;
    }

    public List<Visit> getClubVisits() {
        return clubVisits;
    }

    public void setClubVisits(List<Visit> clubVisits) {
        this.clubVisits = clubVisits;
    }
}

