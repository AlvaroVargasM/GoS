
package sprites;

public class Captain extends Dragon{
    
    private String[] infantryInCommand;

    public Captain(String name, float x, float y) {
        super(name, "captain",x, y);
    }
    
    public void setInfantryInCommand(String[] infantryInCommand) {
        this.infantryInCommand = infantryInCommand;
    }
    public String[] getInfantryInCommand() {
        return infantryInCommand;
    }
}
