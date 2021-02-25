package profession;

import java.util.Date;

public class Doctor extends Profession {
  public String directionOfActivity;
   public String tool;

    public Doctor(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

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
