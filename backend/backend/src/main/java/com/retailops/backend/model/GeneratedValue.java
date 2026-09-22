package com.retailops.backend.model;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {
    GenerationType strategy();
}
