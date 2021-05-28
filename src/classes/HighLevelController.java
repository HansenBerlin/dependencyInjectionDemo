package classes;
import interfaces.*;

public class HighLevelController 
{
    private ILowLevelControllerOne lowLevelControllerOne;
    private ILowLevelControllerTwo lowLevelControllerTwo;

    public HighLevelController(ILowLevelControllerOne lowLevelControllerOne, ILowLevelControllerTwo lowLevelControllerTwo)
    {
        this.lowLevelControllerOne = lowLevelControllerOne;
        this.lowLevelControllerTwo = lowLevelControllerTwo;
    }

    public void substractBothOperations()
    {
        int resultAdd = lowLevelControllerOne.addNumbers();
        int resultMultiply = lowLevelControllerTwo.multiplyNumbers();
        System.out.printf("Add operation result: %d\nMultiply operation result: %d\nAdd - multiply result: %d",
            resultAdd, resultMultiply, resultAdd - resultMultiply);        
    }    
}
