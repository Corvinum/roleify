package io.roleify.races;

public class Human extends AbstractRace implements IHuman{
    //GETTER
    @Override
    public String getNameRace() {
        return nameRace;
    }


    //BEHAVIOURS
    @Override
    public void caminar() {
        System.out.println("S");
    }
}