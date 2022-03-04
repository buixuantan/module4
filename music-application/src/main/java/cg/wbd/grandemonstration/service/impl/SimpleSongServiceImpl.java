package cg.wbd.grandemonstration.service.impl;

import cg.wbd.grandemonstration.model.Song;
import cg.wbd.grandemonstration.service.ISongService;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;

public class SimpleSongServiceImpl implements ISongService {

    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    //    cho hibernate tạo kết nối tới database
    static {
        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            sessionFactory.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Song save(Song song) {
        return null;
    }
}
