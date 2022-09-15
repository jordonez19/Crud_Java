
package com.sinfloo.demo.services;

import com.sinfloo.demo.interfaceService.IpersonaService;
import com.sinfloo.demo.interfaces.IPersona;
import com.sinfloo.demo.modelo.User;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements  IpersonaService{

    @Autowired
    private IPersona data;
    
    @Override
    public List<User> listar() {
        return (List<User>)data.findAll();
    }

    @Override
    public int save(User p) {
        int res = 0;
        User user = data.save(p);
        if(!user.equals(null)){
            res = 1;
        }
        return 0;
    }

    @Override
    public Optional<User> listarId(int id) {
        return data.findById( id );
    }


    @Override
    public void delete(int id) {
        data.deleteById( id );
    }
    
}
