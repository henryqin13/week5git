package use_case.clear_users;

// TODO Complete me

import data_access.FileUserDataAccessObject;
import entity.UserFactory;
import interface_adapter.UserCreationFailed;

import entity.User;
import use_case.signup.SignupOutputData;

import java.time.LocalDateTime;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;


    public ClearInteractor (ClearUserDataAccessInterface userDataAccessObject,
            ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = clearOutputBoundary;


    }

    public void execute(){
        String users_list = userDataAccessObject.clearYouAllBye();
        ClearOutputData clearOutputData = new ClearOutputData(users_list);
        this.userPresenter.displayJ(clearOutputData);
    }
}
