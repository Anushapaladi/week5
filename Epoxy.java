public class Epoxy {
    private EpoxyTypes type;
    private EpoxyState state;

    public Epoxy(String type){
        this.type = EpoxyTypes.valueOf(type.toUpperCase());
        state = null;
    }

    public void setState(EpoxyState state){
        this.state = state;
    }

    public EpoxyState getState(){
        return state;
    }

    @Override
    public String toString(){
        return type.toString();
    }

}
