package com.pleaseconvert.model;

public enum WeightConversion {
    LBS_TO_KGS("LBS_TO_KGS"),
    KGS_TO_LBS("KGS_TO_LBS");

    private final String name;

    WeightConversion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
