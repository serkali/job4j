package profession;

public class Doctor extends Profession {
  public String directionOfActivity;
   public String tool;

    public String inspection (Pacient pacient){
        return inspect();
    }

    public void setDirectionOfActivity(String directionOfActivity) {
        this.directionOfActivity = directionOfActivity;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String inspect(){
        return inspect();
    }
}
