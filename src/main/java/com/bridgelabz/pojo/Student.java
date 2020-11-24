package com.bridgelabz.pojo;

public class Student {
    private String name;
    private String batch;
    private String message;
    public Student(String name, String batch) {
        this.name = name;
        this.batch = batch;
        this.message = "Hello "+name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Hello: "+name);
    }

}
