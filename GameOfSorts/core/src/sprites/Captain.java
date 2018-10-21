
package sprites;

public class Captain extends Dragon{
    
    private String[] infantryInCommand;

    public Captain(String name, int position) {
        super(name, "captain", position);
        setResistance(2);
    }
    
    public void setInfantryInCommand(String[] infantryInCommand) {
        this.infantryInCommand = infantryInCommand;
    }
    public String[] getInfantryInCommand() {
        return infantryInCommand;
    }
}