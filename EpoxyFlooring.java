public class EpoxyFlooring {

    public void prepare(String flooringtype){
        Epoxy epoxy = new Epoxy(flooringtype);

        processState(epoxy, new SurfacePreparation());
        processState(epoxy, new SurfacePriming());
        processState(epoxy, new Mixing());
        processState(epoxy, new Application());

        System.out.println("Epoxy Flooring completed\n");
    }
    public void processState(Epoxy epoxy, EpoxyState state){
        epoxy.setState(state);
        epoxy.getState().process(epoxy);
        System.out.println(epoxy.getState().toString());
    }
}
