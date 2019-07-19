package com.wx.exam1.dao;

import com.wx.exam1.domain.Film;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FilmMapper {
    Integer insertFilm(Film film);
}
