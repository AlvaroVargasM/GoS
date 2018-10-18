
package sprites;

public class Commander extends Dragon{
    
    private String infantryInCommand;

    public Commander(String name, float x, float y) {
        super(name,"commander",x, y);
    }
    
    
    public void setInfantryInCommand(String infantryInCommand){
        this.infantryInCommand = infantryInCommand;
    }
    
    public String getInfantryInCommand() {
        return infantryInCommand;
    }
}
