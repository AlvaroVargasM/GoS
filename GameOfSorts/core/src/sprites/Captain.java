
package sprites;

/**
 * Captain dragon class. They are the mid tier dragons.
 * @author Luis Mariano Ramírez Segura
 */
public class Captain extends Dragon{
    private String[] infantryInCommand;

    /** 
     * Captain dragon class constructor.
     * @param name Unique name assigned to the dragon.
     * @param position The dragon's intial position for layout display.
     */
    public Captain(int position) {
        super("captain", position);
        String[] randomDrag = {randomName(),randomName(),randomName()};
        setInfantryInCommand(randomDrag);
    }
    
    /**
     * Sets the dragons captained by this dragon.
     * @param infantryInCommand Dragons captained by this dragon.
     */
    public void setInfantryInCommand(String[] infantryInCommand) {
        this.infantryInCommand = infantryInCommand;
    }

    /**
     * Returns the names of the dragons captained by this dragon.
     * @return Dragons captained by this dragon.
     */
    public String[] getInfantryInCommand() {
        return infantryInCommand;
    }
}
