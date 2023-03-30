package withobserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void notify(int count){
        for(int i=0; i<observerList.size(); i++){
            observerList.get(i).update(count);
        }
    }
}
