package fom.authapi.user;
/*
 *  Created by griff on 7/24/18 .
 */

import fom.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
