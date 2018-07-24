package fom;
/*
 *  Created by griff on 7/23/18 .
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
class ClubOwner extends ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Club club;
    private Location currentLocation;
    private List<Location> previousLocations;

}
