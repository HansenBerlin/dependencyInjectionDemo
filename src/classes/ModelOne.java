package classes;
import interfaces.IModelOne;

// Service, der dem Client (controller) zur Verfügung gestellt werden soll

public class ModelOne implements IModelOne
{
    private int number;

    public int getNumber() 
    {
        return number;
    }

    public void setNumber(int number) 
    {
        this.number = number;        
    }
    
}
