package pwo.lab09.factory;

public class Friday implements MessageFactory {
    @Override 
    public String createIntroMessage() {
        return "IT'S FRIDAY AGAIN";
    }
    
    @Override
    public String createMainMessage() {
        return "Niech się praca szybciej kończy";
    }
    
    @Override
    public String createClosingMessage() {
        return "Lecimy w balet";
    }
}
