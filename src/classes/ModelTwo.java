package classes;
import interfaces.IModelTwo;

// Service, der dem Client (controller) zur Verfügung gestellt werden soll

public class ModelTwo implements IModelTwo
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
