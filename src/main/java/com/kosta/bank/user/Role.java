package com.kosta.bank.user;

public enum Role {
    ADMIN("Admin"), USER("User"), MANAGER("Manager");

    private final String description;
    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return description;
    }
}
