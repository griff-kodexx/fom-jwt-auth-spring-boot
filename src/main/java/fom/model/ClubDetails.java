package fom.model;
/*
 *  Created by griff on 7/23/18 .
 */

import javax.persistence.*;

@Entity
class ClubDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Club club;
    @OneToOne
    private Location clubLocation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Location getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(Location clubLocation) {
        this.clubLocation = clubLocation;
    }
}
