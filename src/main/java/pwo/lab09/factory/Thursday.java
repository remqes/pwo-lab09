package pwo.lab09.factory;

public class Thursday implements MessageFactory {
    @Override 
    public String createIntroMessage() {
        return "Aby czwartek szybko zleciał.";
    }
    
    @Override
    public String createMainMessage() {
        return "Smacznej czwartkowej kawusi";
    }
    
    @Override
    public String createClosingMessage() {
        return "Jutro ostatni dzień";
    }
}
