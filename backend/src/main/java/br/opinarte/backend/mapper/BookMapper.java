package br.opinarte.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import br.opinarte.backend.entity.Book;
import br.opinarte.backend.request.BookPostRequestBody;
import br.opinarte.backend.request.BookPutRequestBody;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface BookMapper {
	public static final BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

	@Mapping(target = "id", ignore = true)
	public abstract Book toBook(BookPostRequestBody bookPostRequestBody);

	public abstract Book toBook(BookPutRequestBody bookPutRequestBody);
}
