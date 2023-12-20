package org.example;
import java.util.ArrayList;
import java.util.List;
//抽卡相关操作的外观模式
public class DrawCardFaceade {
    //抽卡策略
    private CardStrategy93 singleDrawStrategy;
    private CardStrategy93 tenDrawStrategy;
    //被观察者
    private Subject93 subject = new SubjectImpl93();
    //备忘录
    private CareTaker93 careTaker = new CareTaker93();
    private Originator93 originator = new Originator93();
    public String upName;
    private int pool;
    public DrawCardFaceade(String upName,int pool){
        this.upName = upName;
        this.pool = pool;
        singleDrawStrategy = new SingleDrawCardStrategy93();
        tenDrawStrategy = new TenDrawCardStrategy93();
        new DrawResutlObserver93(subject);
        new WeaponBagObserver93(subject);
    }
    public void tenDraw(){
        StrategyContext93 strategyContext = new StrategyContext93(tenDrawStrategy);
        ArrayList<AbstractDecorator93> tenResult = strategyContext.executeStrategy(this.upName,pool);
        saveStateToMemento(tenResult);
        subject.notifyObserver(tenResult);
    }
    public void singleDraw(){
        StrategyContext93 strategyContext = new StrategyContext93(singleDrawStrategy);
        ArrayList<AbstractDecorator93> singleResult = strategyContext.executeStrategy(this.upName,pool);
        saveStateToMemento(singleResult);
        subject.notifyObserver(singleResult);
    }
    private void saveStateToMemento(ArrayList<AbstractDecorator93> arrayList){
        originator.setState(arrayList);
        careTaker.add(originator.saveStateToMemento());
    }
    public List<Memento93> getAllMemento(){ return careTaker.all();}
}
