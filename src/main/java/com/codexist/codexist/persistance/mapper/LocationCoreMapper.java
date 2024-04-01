package com.codexist.codexist.persistance.mapper;

import com.codexist.codexist.core.data.dto.LocationDto;
import com.codexist.codexist.persistance.data.dbmodel.LocationEntity;
import org.springframework.stereotype.Component;

@Component
public class LocationCoreMapper {
    public LocationDto toDto(LocationEntity entity) {
        return LocationDto.builder()
                .id(entity.getId())
                .latitude(entity.getLatitude())
                .longitude(entity.getLongitude())
                .radius(entity.getRadius())
                .googlePlace(entity.getGooglePlace())
                .createdDateTime(entity.getCreatedDateTime())
                .build();
    }
}
