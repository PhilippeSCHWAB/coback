package com.sample.postgress.errorHandling;

public class EntityNotFoundException extends RuntimeException {
    private String entityName;

    public EntityNotFoundException(String message, String entityName) {
        super(message);
        this.entityName = entityName;
    }

    public String getEntityName() {
        return entityName;
    }
}
