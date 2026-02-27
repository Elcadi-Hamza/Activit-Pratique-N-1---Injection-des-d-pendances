package net.hamza.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData () {
        System.out.println("Version base de données");
        return 34;
    }
}
