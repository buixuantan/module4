package cg.wbd.grandemonstration.servlet;

import cg.wbd.grandemonstration.model.Song;
import cg.wbd.grandemonstration.service.ISongService;
import cg.wbd.grandemonstration.service.SongServiceFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SongServlet extends HttpServlet {
    private ISongService iSongService = SongServiceFactory.getInstance();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Song song = new Song();
        song.setName(req.getParameter("name"));
        song.setArtist(req.getParameter("artist"));
        song.setKind(req.getParameter("kind"));
        int id = Integer.parseInt(req.getParameter("id"));
        song.setId(id);
        iSongService.save(song);
        resp.sendRedirect("/customers/list.jsp");
    }

}
