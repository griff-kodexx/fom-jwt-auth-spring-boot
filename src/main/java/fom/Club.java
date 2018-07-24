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
class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Location clubLocation;
    private List<Event> events;
    private List<Deal> deals;
    private ClubDetails clubDetails;
    private ClubOwner clubOwner;
    private List<Visit> clubVisits;


}

