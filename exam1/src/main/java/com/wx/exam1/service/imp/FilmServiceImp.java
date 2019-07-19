package com.wx.exam1.service.imp;

import com.wx.exam1.dao.FilmMapper;
import com.wx.exam1.domain.Film;
import com.wx.exam1.service.FilmService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class FilmServiceImp implements FilmService {
    @Resource
    private FilmMapper filmMapper;

    @Transactional
    @Override
    public Integer insertFilm(Film film) {
        Integer integer = filmMapper.insertFilm(film);
        return integer;
    }
}
