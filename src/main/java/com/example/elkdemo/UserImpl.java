package com.example.elkdemo;

public class UserImpl<T> implements User<T> {
    T t;
    @Override
    public T getValue() {
        return t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public UserImpl(T t) {
         this.setT(t);
    }

    public static UserImpl test(){
        UserImpl<Object> objectUser = new UserImpl<>(String.class);
        objectUser.setT("aaa");
        return objectUser;
    }

    public static void main(String[] args) {
        UserImpl test = test();
        System.out.println(test.getT());
    }

}
