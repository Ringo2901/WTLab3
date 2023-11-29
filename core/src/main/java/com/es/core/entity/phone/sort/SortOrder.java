package com.es.core.entity.phone.sort;

import java.util.Arrays;

public enum SortOrder {
    ASC,
    DESC;
    public static SortOrder getValue(String name) {
        return Arrays.stream(SortOrder.values())
                .filter(value -> value.name().equals(name.toUpperCase()))
                .findAny()
                .orElse(null);
    }
}
