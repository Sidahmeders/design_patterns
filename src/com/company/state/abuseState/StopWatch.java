package com.company.state.abuseState;

public class StopWatch {
//    private boolean isRunning;
    private State currentState = new StoppedState(this);
    public void click() {
      currentState.click();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
