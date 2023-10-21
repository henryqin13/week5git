package interface_adapter.clear_users;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;


import javax.swing.*;

// TODO Complete me

public class ClearPresenter implements ClearOutputBoundary{


    public void displayJ(ClearOutputData clearOutputData){
        JOptionPane.showMessageDialog(null, clearOutputData.getter());
    }


}
