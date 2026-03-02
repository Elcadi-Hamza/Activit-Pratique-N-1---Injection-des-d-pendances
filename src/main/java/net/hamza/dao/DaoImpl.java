package net.hamza.dao;

import org.springframework.stereotype.Component;
// annotation version text add start
@Component("dao") // si tu n'a pas specifier le nom il va devenir DaoImpl
// annotation version text add end
public class DaoImpl implements IDao {
    @Override
    public double getData () {
        System.out.println("Version base de données");
        return 34;
    }
}
