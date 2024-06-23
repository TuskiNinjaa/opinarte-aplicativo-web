package br.opinarte.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import br.opinarte.backend.entity.Serie;
import br.opinarte.backend.request.SeriePostRequestBody;
import br.opinarte.backend.request.SeriePutRequestBody;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface SerieMapper {
    public static final SerieMapper INSTANCE = Mappers.getMapper(SerieMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "releaseDate", ignore = true)
    @Mapping(target = "genre", ignore = true)
    @Mapping(target = "director", ignore = true)
    @Mapping(target = "seasons", ignore = true)
    @Mapping(target = "description", ignore = true)
    public abstract Serie toSerie(SeriePostRequestBody seriePostRequestBody);

    public abstract Serie toSerie(SeriePutRequestBody seriePutRequestBody);
}
