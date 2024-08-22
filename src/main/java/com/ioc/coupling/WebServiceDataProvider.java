package com.ioc.coupling;

public class WebServiceDataProvider implements UserDataProvider {


    @Override
    public String getUserDetails() {
        return "User from WS";
    }
}
