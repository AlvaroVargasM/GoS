
package sprites;

public class Commander extends Dragon{
    
    private String dragonsInCommand[];

    public Commander(String name, float x, float y) {
        super(name,"commander",x, y);
    }
    
    
    public void setDragonsInCommand(String[] dragonsInCommand){
        this.dragonsInCommand = dragonsInCommand;
    }
    
    public String[] getDragonsInCommand() {
        return dragonsInCommand;
    }
}
