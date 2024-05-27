package io.roleify.race;

public abstract class AbstractRace {
    //ATTRIBS
    protected String nameRace;

    //DEFAULT CONSTRUCTOR
    protected AbstractRace() {
    }

    protected AbstractRace(String nameRace) {
        this.nameRace = nameRace;
    }

    //SETTER
    protected void setNameRace(String nameRace){
        this.nameRace = nameRace;
    }
    //GETTER
    public String getNameRace() {
        return nameRace;
    }
}
