import java.util.ArrayList;

public class Publishing implements Observed{
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<Observer> subscibers= new ArrayList<>();

    public void addInfo(String info){
        this.list.add(info);
        notifyObservers();
    }
    public void removeInfo(String info){
        this.list.remove(info);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscibers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscibers.remove(observer);
    }

    @Override
    public void removeAllObservers() {
        this.subscibers.removeAll(subscibers);
    }

    @Override
    public void notifyObservers() {
        for (var i: this.subscibers){
            i.handleEvent(this.list);
        }
    }
}
