package fom;
/*
 *  Created by griff on 7/23/18 .
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //get from google maps api possible structure
}
