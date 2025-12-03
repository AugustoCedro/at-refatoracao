package com.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {

    private String name;
    private String email;
    private List<Address> addressList;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.addressList = new ArrayList<>();
    }

    public void addAddress(Address address) {
        if(addressList != null) {
            this.addressList.add(address);
        }else {
            throw new IllegalArgumentException("Address is null");
        }
    }

    public List<Address> getAddress() {
        return Collections.unmodifiableList(addressList);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
