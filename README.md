For add project you have to do:

    - add all jars under lib/* to classpath

    - create new database with your credential (root / password) - for ex. - _hotel_ordering_db

    - change next properties to your own:

        <property name="hibernate.connection.username">your-user-name</property>
        <property name="hibernate.connection.password">your-password</property>

    - to sure that at hibernate.cfg.xml, has next uncomment / comment line:

            <property name="hbm2ddl.auto">create</property>
            <!--<property name="hbm2ddl.auto">update</property>-->

    - run main() at Application class.-

    - if console doesn't contain error and print:

        THE END

    all is fine.

    - to sure that all tables are created

    - change hibernate.cfg.xml to:

        <!--<property name="hbm2ddl.auto">create</property>-->
        <property name="hbm2ddl.auto">update</property>

