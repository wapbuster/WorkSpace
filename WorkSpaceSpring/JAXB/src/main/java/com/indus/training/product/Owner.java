package com.indus.training.product;

public class Owner {
    private int id;
    private String name;
    private String email;

    public Owner() {
    }

    public Owner(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public Owner setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Owner setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Owner setEmail(String email) {
        this.email = email;
        return this;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

    
}
