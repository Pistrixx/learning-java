public abstract class Geometry {

    private String type;

    public void show(){
        System.out.println(type);
    }

    public abstract void showFigureType();
    public abstract String getData();
    public abstract String getCircuit();

}
