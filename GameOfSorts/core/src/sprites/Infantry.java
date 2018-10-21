
package sprites;

public class Infantry extends Dragon{
    
    private String captain;

    public Infantry(String name, int position) {
        super(name,"infantry",position);
    }
    
    public void setCaptain(String captain) {
        this.captain = captain;
    }
    public String getCaptain() {
        return captain;
    }
}
