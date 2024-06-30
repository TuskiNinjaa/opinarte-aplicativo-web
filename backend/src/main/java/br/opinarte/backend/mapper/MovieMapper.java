package br.opinarte.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import br.opinarte.backend.entity.Movie;
import br.opinarte.backend.request.MoviePostRequestBody;
import br.opinarte.backend.request.MoviePutRequestBody;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface MovieMapper {
	public static final MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

	@Mapping(target = "id", ignore = true)
	public abstract Movie toMovie(MoviePostRequestBody moviePostRequestBody);

	public abstract Movie toMovie(MoviePutRequestBody moviePutRequestBody);
}
