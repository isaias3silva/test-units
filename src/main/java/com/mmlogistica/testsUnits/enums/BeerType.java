package com.mmlogistica.testsUnits.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {

    PILSEN("Pilsen"),
    LAGER("Lager"),
    PALE_ALE("Pale Ale"),
    BOCK("Bock"),
    MALZBIER("Malzbier"),
    WITBIER("Witbier"),
    WEISS("Weiss"),
    ALE("Ale"),
    IPA("IPA"),
    STOUT("Stout"),
    PORTER("Porter"),
    TRIPPEL("Trippel");

    private final String description;
}
