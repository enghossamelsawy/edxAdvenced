package edu.galileo.mvp;

/**
 * Created by Hossam Elsawy on 7/11/17.
 * Xdigital Group company
 */

public interface LoginModel {

    interface  OnLoginFinishListener{
        void onCancel();
        void onPasswordError();
        void onSucces();
    }

    void login (String username ,String password, OnLoginFinishListener listener);
}
