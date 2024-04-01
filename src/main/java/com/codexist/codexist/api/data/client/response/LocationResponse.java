package com.codexist.codexist.api.data.client.response;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
public class LocationResponse {
    private String id;
    private String longitude;
    private String latitude;
    private String radius;
    private String googlePlace;
    private ZonedDateTime createdDateTime;
}
