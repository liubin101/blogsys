package com.lb.mapper.custom;

import com.lb.entity.custom.ArtCommentCustom;

import java.util.List;

public interface ArtCommentMapperCustom {
    List<ArtCommentCustom> findCommentsByArtId(long artId)throws Exception;
}
