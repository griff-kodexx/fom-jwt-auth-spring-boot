package fom;
/*
 *  Created by griff on 7/23/18 .
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Reveller reveller;
    private Club club;
    private Location originalRevellerLocation;
    private Location currentRevellerLocation;
    private Location clubLocation;
    private Date time;

}
