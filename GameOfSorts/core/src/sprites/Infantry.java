
package sprites;

public class Infantry extends Dragon{
    
    private String captain;

    public Infantry(String name,float x, float y) {
        super(name,"infantry",x, y);
    }
    
    public void setCaptain(String captain) {
        this.captain = captain;
    }
    public String getCaptain() {
        return captain;
    }
}
