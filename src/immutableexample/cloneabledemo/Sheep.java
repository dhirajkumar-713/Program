package immutableexample.cloneabledemo;

public class Sheep implements Cloneable{
    int cost=9000;
    int[] iArray={4,5,3};

    public Sheep() {
        System.out.println("Sheep's Constructor called");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
