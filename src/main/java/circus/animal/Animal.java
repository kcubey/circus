package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {

    //all subclasses require this method
    public abstract String speak();
}
