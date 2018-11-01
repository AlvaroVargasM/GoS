
package sprites;

/**
 * Commander dragon class. They are the high tier dragons.
 * @author Luis Mariano Ramírez Segura
 */
public class Commander extends Dragon{
    private String dragonsInCommand[];

    /**
     * Commander dragon class constructor.
     * @param name Unique name assigned to the dragon.
     * @param position The dragon's intial position for layout display.
     */
    public Commander(int position) {
        super("commander", position);
        String[] randomDrag = {randomName(),randomName(),randomName()};
        setDragonsInCommand(randomDrag);
    }
    
    /**
     * Sets the dragons commanded by this dragon.
     * @param dragonsInCommand Dragons commanded by this dragon.
     */
    public void setDragonsInCommand(String[] dragonsInCommand){
        this.dragonsInCommand = dragonsInCommand;
    }
    
    /**
     * Returns the dragons commanded by this dragon.
     * @return Dragons commanded by this dragon.
     */
    public String[] getDragonsInCommand() {
        return dragonsInCommand;
    }
}
