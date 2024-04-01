package com.codexist.codexist.core.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocationDto {
    private String id;
    private String longitude;
    private String latitude;
    private String radius;
    private String googlePlace;
    private Long createdDateTime;
}
