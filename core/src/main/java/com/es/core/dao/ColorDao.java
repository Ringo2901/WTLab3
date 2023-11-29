package com.es.core.dao;

import com.es.core.entity.phone.color.Color;

import java.util.List;

public interface ColorDao {
    List<Color> getColors(Long id);
}
