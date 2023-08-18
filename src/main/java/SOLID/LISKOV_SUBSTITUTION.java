package SOLID;
//derived classes must be completely substitutable for their base classes.

public class LISKOV_SUBSTITUTION {

    int length;
    int width;

    public void setLen(int len){
        this.length=len;
    }

    public void setWid(int wid){
        this.width=wid;
    }
}
//
class LISKOV_IMPL extends LISKOV_SUBSTITUTION{
    public void setLen(int len){
        super.length=len;
    }

    public void setWid(int wid){
        super.width=wid;
    }
}
