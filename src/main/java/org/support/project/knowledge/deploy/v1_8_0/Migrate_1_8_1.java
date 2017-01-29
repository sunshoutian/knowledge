package org.support.project.knowledge.deploy.v1_8_0;

import org.support.project.knowledge.deploy.Migrate;
import org.support.project.ormapping.tool.dao.InitializeDao;

public class Migrate_1_8_1 implements Migrate {

    public static Migrate_1_8_1 get() {
        return org.support.project.di.Container.getComp(Migrate_1_8_1.class);
    }

    @Override
    public boolean doMigrate() throws Exception {
        InitializeDao initializeDao = InitializeDao.get();
        String[] sqlpaths = {
            "/org/support/project/knowledge/deploy/v1_8_0/migrate2.sql",
        };
        initializeDao.initializeDatabase(sqlpaths);
        return true;
    }
}