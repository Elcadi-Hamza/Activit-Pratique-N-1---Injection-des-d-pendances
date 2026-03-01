package net.hamza.ext;

import net.hamza.dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteur ...");
        return 120;
    }
}
