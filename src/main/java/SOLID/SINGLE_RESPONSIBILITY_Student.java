package SOLID;
//every Java class must perform a single functionality.


public class SINGLE_RESPONSIBILITY_Student {
    public void addStudent(){
        //TODO
    }

    public void calculatePercentage(){ // violating as multiple responsibility
        //TODO
    }

    public void printDetails(){
        //TODO
    }
}

//better to separate in 3 class with single responsibility
class Student{
    public void addStudent(){
        //TODO
    }
}

class PrintAll{
    public void printDetails(){
        //TODO
    }
}
class CalPercent{
    public void calculatePercentage(){ // violating as multiple responsibility
        //TODO
    }
}
