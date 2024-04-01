package com.codexist.codexist.api.controller;

import com.codexist.codexist.api.data.client.response.LocationResponse;
import com.codexist.codexist.api.mapper.LocationApiMapper;
import com.codexist.codexist.core.service.LocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {
    private final LocationService locationService;
    private final LocationApiMapper mapper;

    public LocationController(LocationService locationService, LocationApiMapper mapper) {
        this.locationService = locationService;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<LocationResponse> location(@RequestParam String longitude, @RequestParam String latitude, @RequestParam String radius) {
        return ResponseEntity.ok(mapper.toResponse(locationService.get(longitude, latitude, radius)));
    }
}
