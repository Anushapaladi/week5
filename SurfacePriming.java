public class SurfacePriming implements EpoxyState{
    public void process(Epoxy epoxy){
        System.out.println("Priming of Surface");
        epoxy.setState(this);
    }
    public String toString(){
        return "Surface priming state";
    }
}
