
package com.sinfloo.demo.interfaceService;

import com.sinfloo.demo.modelo.User;
import java.util.List;
import java.util.Optional;

public interface IpersonaService {
    public List<User> listar();
    public Optional<User> listarId(int id);
    public int save(User p);
    public void delete(int id);
       
}
