// Einfaches Beispiel zur Dependency Injection nach dem Prinzip IOC
// (Inversion of Control) durch Konstruktorinjektion. Alle Objekte, von
// denen andere abhängen (services) werden zentral gebaut und dezidiert an 
// die Objekte, die diese benötigen (clients) übergeben. Es müssen keine Objekte
// inner halb von Methoden erzeugt werden, alle Module sind entkoppelt und
// dadurch, dass Interfaces einfach gemockt werden können, als unabhängige
// unit testbar.
// Die Funktion der Klassen macht hier natürlich wenig sind/ ist redundant,
// dient aber der Veranschaulichung.

import classes.*;
import interfaces.*;

public class Main 
{
    public static void main(String[] args)
    {
        // Konstruktion der Services als Interfaces
        IModelOne modelOne = new ModelOne();
        IModelTwo modelTwo = new ModelTwo();

        // Konstruktorinjektion der Services in die Clients
        ILowLevelControllerOne controllerAdd = new LowLevelControllerOne(modelOne, modelTwo);
        ILowLevelControllerTwo controllerMultiply = new LowLevelControllerTwo(modelOne, modelTwo);
       
        // "Nachträglches Setzen der Propertywerte der injizierten Services"
        modelOne.setNumber(5);
        modelTwo.setNumber(5);
        System.out.println(controllerAdd.addNumbers());
        System.out.println(controllerMultiply.multiplyNumbers());

        // Nachweis der Unabhängigkeit der Objekte (zentrale Manipulation) auch
        // in anderen Objekten durch Inversion of Control
        modelOne.setNumber(10);
        modelTwo.setNumber(10);
        System.out.println(controllerAdd.addNumbers());
        System.out.println(controllerMultiply.multiplyNumbers());

        // One Step further: Verwendung der Clients (Controller)
        // als Services für einen weiteren (higher level) Client
        // Die Werte der Properties der injizierten Werte sind
        // die gleichen und können weiter verwendet werden
        var controllerCombine = new HighLevelController(controllerAdd, controllerMultiply);
        controllerCombine.substractBothOperations();
    }
}
