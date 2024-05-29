package io.roleify.beast;

public class Beast {
    //ATTRIBS
    protected String name;
    protected String description;

    public Beast(String name, String description) {
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
        return "ID: " + BeastDatabase.getBeastId(this) + "\nNombre: " + name + "\nDescripción: " + description;

    }

    public void setAttributes(){
        System.out.println("name");
    }
}