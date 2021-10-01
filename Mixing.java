public class Mixing implements EpoxyState{
    public void process(Epoxy epoxy){
        System.out.println("Mixing epoxy ingredients");
        epoxy.setState(this);
    }
    public String toString(){
        return "Ingredient Mixing";
    }
}
