package pwo.lab09.factory;

public class Wednesday implements MessageFactory {
    @Override 
    public String createIntroMessage() {
        return "No i środa.";
    }
    
    @Override
    public String createMainMessage() {
        return "Środa minie, tydzień zginie";
    }
    
    @Override
    public String createClosingMessage() {
        return "Środowa noc to wódy czas";
    }
}
