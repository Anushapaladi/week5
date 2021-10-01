public class Application implements EpoxyState{
    public void process(Epoxy epoxy){
        System.out.println("Applying "+ epoxy.toString());
        epoxy.setState(this);
    }
    public String toString(){
        return "Applying Epoxy";
    }
}
