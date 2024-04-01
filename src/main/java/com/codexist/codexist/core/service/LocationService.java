package com.codexist.codexist.core.service;

import com.codexist.codexist.core.data.dto.LocationDto;
import com.codexist.codexist.persistance.mapper.LocationCoreMapper;
import com.codexist.codexist.persistance.repository.LocationRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    private final LocationRepository repository;
    private final LocationCoreMapper mapper;

    public LocationService(LocationRepository repository, LocationCoreMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public LocationDto get(String longitude, String latitude, String radius) {
        return repository.findByLongitudeAndLatitudeAndRadius(longitude, latitude, radius)
                .map(mapper::toDto)
                .orElseGet(() -> searchAndSave(longitude, latitude, radius));
    }

    private LocationDto searchAndSave(String longitude, String latitude, String radius) {
        return new LocationDto();
    }
}
