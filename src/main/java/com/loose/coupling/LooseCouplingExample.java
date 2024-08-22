package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        //Tao nha cung cap
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        //Tao quan li, noi cho biet nha cung cap nao
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        //
        UserDataProvider userDataWS = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(userDataWS);
        System.out.println(userManagerWithWS.getUserInfo());
    }
}
