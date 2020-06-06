package chapter02.custom_implementation;

import chapter02.custom_implementation.Observer;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
