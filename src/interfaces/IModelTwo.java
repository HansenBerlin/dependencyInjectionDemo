package interfaces;

// Interface zur kompletten Enkopplung der Abhängigkeiten
// Ginge in diesem einfachen Beispiel auch ohne, für echtes
// Decoupling und Testbarkeit aber zu empfehlen, weil dann 
// (hier in der Main) keine konkreten Objekte gebaut werden
// müssen von denen dann wieder Abhängigkeiten ausgehen

public interface IModelTwo
{
    public int getNumber();
    public void setNumber(int number);
    
}
