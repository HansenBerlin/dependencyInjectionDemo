## Dependency Injection und IOC Demo

Einfaches Beispiel zur Dependency Injection nach dem Prinzip IOC (Inversion of Control) durch Konstruktorinjektion. Alle Objekte, von denen andere abhängen (services) werden zentral gebaut und dezidiert an die Objekte, die diese benötigen (clients) übergeben. Es müssen keine Objekte innerhalb von Methoden erzeugt werden, alle Module sind entkoppelt und dadurch, dass Interfaces einfach gemockt werden können, als unabhängige Unit testbar.
Die Funktion der Klassen macht hier natürlich wenig Sinn/ ist redundant, dient aber der Veranschaulichung.
