public class SurfacePreparation implements EpoxyState{
    public void process(Epoxy epoxy){
        System.out.println("Preparing Floor for "+ epoxy.toString());
        epoxy.setState(this);
    }
    public String toString(){
        return "Floor preparation state";
    }
}
