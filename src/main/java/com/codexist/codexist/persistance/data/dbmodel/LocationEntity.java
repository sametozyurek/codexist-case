package com.codexist.codexist.persistance.data.dbmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class LocationEntity {
    @Id
    private String id;
    private String longitude;
    private String latitude;
    private String radius;
    private String googlePlace;
    private Long createdDateTime;
}
