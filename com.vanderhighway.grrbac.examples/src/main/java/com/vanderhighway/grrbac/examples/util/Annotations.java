package com.vanderhighway.grrbac.examples.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Annotations {
    public boolean isAccessControlled;
    public boolean isLocked;
}
