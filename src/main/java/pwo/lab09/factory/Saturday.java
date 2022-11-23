package pwo.lab09.factory;

public class Saturday implements MessageFactory {
    @Override 
    public String createIntroMessage() {
        return "Synek wstawaj, bojowe zadanie";
    }
    
    @Override
    public String createMainMessage() {
        return "Synek co ty cały dzień w kąkuter klikasz";
    }
    
    @Override
    public String createClosingMessage() {
        return "Lecimy w balet";
    }
}
