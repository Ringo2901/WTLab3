package com.es.core.entity.phone.sort;

import java.util.Arrays;

public enum SortField {
    BRAND,
    MODEL,
    DISPLAYSIZEINCHES,
    PRICE;
    public static SortField getValue(String name) {
        return Arrays.stream(SortField.values())
                .filter(value -> value.name().equals(name.toUpperCase()))
                .findAny()
                .orElse(null);
    }
}
