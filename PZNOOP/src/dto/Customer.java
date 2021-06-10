package dto;

import en.Level;
/*
    implementasi enum Level

    app/CostumerApp
 */
public class Customer {
    private String name;
    Level level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
