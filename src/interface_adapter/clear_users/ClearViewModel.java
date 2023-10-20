package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupState;

public class ClearViewModel {
    private ClearState state = new ClearState();
    public void setState(ClearState state) {
        this.state = state;
    }
    public ClearState getState() {
        return state;
    }
}
