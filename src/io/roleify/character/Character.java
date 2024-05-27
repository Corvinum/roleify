package io.roleify.character;

public class Character {
    //ATTRIBS
    protected String name;
    protected String description;

    public Character(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
    //SETTERS
    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return "ID: " + CharacterDatabase.getCharacterId(this) + "\nNombre: " + name + "\nDescripción: " + description;

    }

    public void setAttributes(){
        System.out.println("name");
    }
}