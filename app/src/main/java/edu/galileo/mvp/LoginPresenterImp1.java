package edu.galileo.mvp;

import android.text.TextUtils;

/**
 * Created by Hossam Elsawy on 7/13/17.
 * Xdigital Group company
 */

public class LoginPresenterImp1 implements LoginPresenter ,LoginModel.OnLoginFinishListener{

    private  LoginModel loginModel;
    private  LoginView loginView;

    public LoginPresenterImp1(LoginView loginView) {
        this.loginView = loginView;
        this.loginModel = new LoginModelImp1();
    }

    @Override
    public void validateCredentials(String userName, String password) {


        // Check for a valid password, if the user entered one.
        if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {


            loginView.setPasswordError(R.string.error_invalid_password);
            return;

        }

        // Check for a valid email address.
        if (TextUtils.isEmpty(userName)) {

            loginView.setUserNameError(R.string.error_field_required);
            return;
        } else if (!isEmailValid(userName)) {


            loginView.setUserNameError(R.string.error_invalid_email);
            return;
        }

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        } else {
            // Show a progress spinner, and kick off a background task to
            // perform the user login attempt.
            showProgress(true);
            mAuthTask = new UserLoginTask(userName, password);
            mAuthTask.execute((Void) null);
        }

    }

    @Override
    public void onCancel() {

    }

    @Override
    public void onPasswordError() {

    }

    @Override
    public void onSucces() {

    }





    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }
}
