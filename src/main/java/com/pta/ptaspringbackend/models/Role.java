package com.pta.ptaspringbackend.models;

public enum Role {
    ADMIN,MOD,USER;

    public String toString(){
        switch(this){
            case ADMIN:
                return "Administrator";
            case MOD:
                return "Moderator";
            case USER:
                return "User";
        }
        return "";
    }
}
