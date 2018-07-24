package fom.model;
/*
 *  Created by griff on 7/23/18 .
 */

import javax.persistence.*;

@Entity
@Table(name = "locations")
class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //get from google maps api possible structure


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
