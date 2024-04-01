package com.codexist.codexist.core.data.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class LocationDto {
    private String id;
    private String longitude;
    private String latitude;
    private String radius;
    private String googlePlace;
    private Long createdDateTime;
}
