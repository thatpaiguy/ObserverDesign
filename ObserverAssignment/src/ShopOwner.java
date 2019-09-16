public class ShopOwner implements Observer { //the shopowner is an observer
    private Subject watchman; //follows what subject does
    public ShopOwner(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    public void update(int warning) { //how the observer knows what subject is doing
        if(warning==1)
            System.out.println("Shop Owner: Close down shop and head home");
        if(warning ==2)
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
    }
}
