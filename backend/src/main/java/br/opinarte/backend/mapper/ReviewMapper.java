package br.opinarte.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import br.opinarte.backend.entity.Review;
import br.opinarte.backend.request.ReviewPostRequestBody;
import br.opinarte.backend.request.ReviewPutRequestBody;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {
    public static final ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);

    @Mapping(target = "reviewId", ignore = true)
    @Mapping(target = "reviewDate", ignore = true)
    public abstract Review toReview(ReviewPostRequestBody reviewPostRequestBody);

    @Mapping(target = "reviewDate", ignore = true)
    public abstract Review toReview(ReviewPutRequestBody reviewPutRequestBody);
}
