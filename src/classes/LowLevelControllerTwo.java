package classes;
import interfaces.*;

// Client der den Service (modelOne und modelTwo) nutzt

public class LowLevelControllerTwo implements ILowLevelControllerTwo
{    
    private IModelOne modelOne;
    private IModelTwo modelTwo;

    public LowLevelControllerTwo(IModelOne modelOne, IModelTwo modelTwo)
    {
        this.modelOne = modelOne;
        this.modelTwo = modelTwo;
    }

    public int multiplyNumbers() 
    {
        return modelOne.getNumber() * modelTwo.getNumber();
    }    
}
