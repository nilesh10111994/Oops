package SOLID;

import java.util.Calendar;

class StandardKeyboard{}
class Monitor{}
public class DEPENDECY_INJECTION {
    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    DEPENDECY_INJECTION(){
        monitor=new Monitor();
        keyboard=new StandardKeyboard();
    }



}

interface Keyboard{}


class Win98{
    private final Keyboard keyboard;
    private final Monitor monitor;


    Win98(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
