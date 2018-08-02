package fom.model;
/*
 *  Created by griff on 7/23/18 .
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visits")
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Reveller reveller;
    @OneToOne
    private Club club;
    @OneToOne
    private Location originalRevellerLocation;
    @OneToOne
    private Location currentRevellerLocation;
    @OneToOne
    private Location clubLocation;
    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reveller getReveller() {
        return reveller;
    }

    public void setReveller(Reveller reveller) {
        this.reveller = reveller;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Location getOriginalRevellerLocation() {
        return originalRevellerLocation;
    }

    public void setOriginalRevellerLocation(Location originalRevellerLocation) {
        this.originalRevellerLocation = originalRevellerLocation;
    }

    public Location getCurrentRevellerLocation() {
        return currentRevellerLocation;
    }

    public void setCurrentRevellerLocation(Location currentRevellerLocation) {
        this.currentRevellerLocation = currentRevellerLocation;
    }

    public Location getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(Location clubLocation) {
        this.clubLocation = clubLocation;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
