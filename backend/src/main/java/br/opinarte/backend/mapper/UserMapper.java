package br.opinarte.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import br.opinarte.backend.entity.User;
import br.opinarte.backend.request.UserPostRequestBody;
import br.opinarte.backend.request.UserPutRequestBody;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public abstract class UserMapper {
	public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "createdDate", ignore = true)
	public abstract User toUser(UserPostRequestBody userPostRequestBody);

	public abstract User toUser(UserPutRequestBody userPutRequestBody);
}
