
package sprites;

/**
 * Infantry dragon class. They are the low tier dragons.
 * @author Luis Mariano Ramírez Segura
 */
public class Infantry extends Dragon{
    private String captain;

    /**
     * Infantry dragon class constructor.
     * @param name Unique name assigned to the dragon.
     * @param position The dragon's intial position for layout display.
     */
    public Infantry(String name, int position) {
        super(name,"infantry",position);
    }
    
    /**
     * Sets the name of the dragon's captain superior.
     * @param captain Dragon's captain superior.
     */
    public void setCaptain(String captain) {
        this.captain = captain;
    }

    /**
     * Returns the name of the dragon's captain superior.
     * @return Dragon's captain superior.
     */
    public String getCaptain() {
        return captain;
    }
}
