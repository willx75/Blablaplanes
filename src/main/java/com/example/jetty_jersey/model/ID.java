package com.example.jetty_jersey.model;

/*
 * Class qui parse les information pour l'ID
 */
public class ID {
    private String id;

    public ID() {
    }

    public ID(String id) {
	this.id = id;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }
}
