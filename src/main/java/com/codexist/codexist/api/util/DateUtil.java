package com.codexist.codexist.api.util;

import lombok.experimental.UtilityClass;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@UtilityClass
public class DateUtil {
    public static ZonedDateTime translateDateTime(long timestamp, ZoneId zoneId) {
        return Instant.ofEpochMilli(timestamp)
                .atZone(ZoneId.of("UTC"))
                .withZoneSameInstant(zoneId);
    }
}
