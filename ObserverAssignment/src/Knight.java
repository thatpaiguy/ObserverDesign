public class Knight implements Observer { //the knight is an observer
    private Subject watchman; //follows what subject does
    public Knight(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    public void update(int warning) { //how the observer knows what subject is doing
        if(warning==1)
            System.out.println("Knight: Helps everyone get home safe");
        if(warning ==2)
            System.out.println("Knight: Prepares for battle");
    }
}
