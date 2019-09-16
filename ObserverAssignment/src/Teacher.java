public class Teacher implements Observer { //the teacher is an observer
    private Subject watchman; //follows what subject does
    public Teacher(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    public void update(int warning) { //how the observer knows what subject is doing
        if(warning==1)
            System.out.println("Teacher: Helps get every kid home safe");
        if(warning ==2)
            System.out.println( "Teacher: Brings all students to the underground shelter");
    }
}
