package edu.galileo.mvp;

/**
 * Created by Hossam Elsawy on 7/11/17.
 * Xdigital Group company
 */

public interface LoginView {

    void showProgress(boolean showProgress);
    void setUserNameError(int messageResId);
    void setPasswordError(int messageResId);
    void succesAction();
}
