package classes;
import interfaces.*;

// Client der den Service (modelOne und modelTwo) nutzt

public class LowLevelControllerOne implements ILowLevelControllerOne
{    
    private IModelOne modelOne;
    private IModelTwo modelTwo;

    public LowLevelControllerOne(IModelOne modelOne, IModelTwo modelTwo)
    {
        this.modelOne = modelOne;
        this.modelTwo = modelTwo;
    }

    public int addNumbers() 
    {
        return modelOne.getNumber() + modelTwo.getNumber();
    }    
}
