package com.freyaselberg.springbooks.model;

public record Author (Integer id, String firstName, String lastName){

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
