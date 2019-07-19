package com.wx.exam1.controller;

import com.google.gson.Gson;
import com.wx.exam1.domain.Film;
import com.wx.exam1.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    private final static String TITLE = System.getenv("TITLE");
    private final static String DESCRIPTION = System.getenv("DESCRIPTION");
    private final static String LANGUAGEID = System.getenv("LANGUAGEID");
    @Autowired
    private FilmService filmService;

    /**
     * 插入一条film数据
     */
    @PutMapping("/insert")
    @ResponseBody
    public String insertFilm() {
        //环境变量中取读取数据
        Film film = new Film();
        film.setTitle(TITLE);
        film.setDescription(DESCRIPTION);
        film.setLanguage_id(Short.parseShort(LANGUAGEID));
        Integer integer = filmService.insertFilm(film);
        System.out.println("自增id:" + film.getFilm_id());
        Gson gson = new Gson();
        return gson.toJson(film);
    }
}
