package pwo.lab09.factory;

public class Sunday implements MessageFactory {
    @Override 
    public String createIntroMessage() {
        return "Synek ile można spać, bojowe zadanie mam";
    }
    
    @Override
    public String createMainMessage() {
        return "Wyjście z psem na spacer";
    }
    
    @Override
    public String createClosingMessage() {
        return "Niedziela wieczór i humor popsuty";
    }
}
