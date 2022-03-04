package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.service.impl.SimpleSongServiceImpl;

public class SongServiceFactory {

    private static ISongService singleton;

    public static synchronized ISongService getInstance() {
        if (singleton == null) {
            singleton = new SimpleSongServiceImpl();
        }
        return singleton;
    }

}
