
package sprites;

public class Commander extends Dragon{
    
    private String dragonsInCommand[];

    public Commander(String name, int position) {
        super(name,"commander", position);
        setResistance(3);
    }
    
    
    public void setDragonsInCommand(String[] dragonsInCommand){
        this.dragonsInCommand = dragonsInCommand;
    }
    
    public String[] getDragonsInCommand() {
        return dragonsInCommand;
    }
}
