package SOLID;
//The principle states that the larger interfaces split into smaller ones.
// Because the implementation classes use only the methods that are required.
// We should not force the client to use the methods that they do not want to use.
public class INTERFACE_SEGREGATION implements Conversion{
    @Override
    public void IntToDouble() {

    }

    @Override
    public void IntToString() {

    }
}


interface Conversion{
    public void IntToDouble();
    public void IntToString();
}

interface IntToDoub{
    public void IntToDouble();
}

interface IntToStr{
    public void IntToString();
}

class Conver implements IntToDoub{

    @Override
    public void IntToDouble() {

    }
}
