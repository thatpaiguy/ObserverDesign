import java.util.ArrayList;
public class Watchman implements Subject { //this is going to be the subject
    private ArrayList<Observer> observers; //array list of observers that will follow the subject
    private int warning;
    public Watchman(){
        observers = new ArrayList<Observer>();
    }
    //overridden methods
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(warning);
        }
    }
    //status updates
    public void issueWarning(int warning) {
        if (warning == 1) {
            System.out.println("WARNING: 1 trumpet was played!");
            this.warning = warning;
            notifyObservers();
        }
        if (warning == 2) {
            System.out.println("WARNING: 2 trumpets were played!");
            this.warning=warning;
            notifyObservers();
        }
    }
}
