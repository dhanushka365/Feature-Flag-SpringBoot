package com.example.demo.config;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;

public enum FeatureFlags implements Feature {

    @Label("book is published")
    IS_PUBLISHED

}
