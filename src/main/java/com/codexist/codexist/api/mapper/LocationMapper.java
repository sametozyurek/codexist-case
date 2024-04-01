package com.codexist.codexist.api.mapper;

import com.codexist.codexist.api.data.client.response.LocationResponse;
import com.codexist.codexist.api.util.DateUtil;
import com.codexist.codexist.core.data.dto.LocationDto;
import org.springframework.stereotype.Component;

import java.time.ZoneId;

@Component
public class LocationMapper {
    public LocationResponse toResponse(LocationDto dto) {
        return LocationResponse.builder()
                .id(dto.getId())
                .latitude(dto.getLatitude())
                .longitude(dto.getLongitude())
                .radius(dto.getRadius())
                .googlePlace(dto.getGooglePlace())
                .createdDateTime(DateUtil.translateDateTime(dto.getCreatedDateTime(), ZoneId.of("UTC")))
                .build();
    }
}
