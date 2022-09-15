
package com.sinfloo.demo.interfaces;

import com.sinfloo.demo.modelo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<User, Integer > {
    
}
