package profession;

import java.util.Date;

public class Dentist extends Doctor{
    public Dentist(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

    @Override
    public String inspect() {
        return super.inspect();
    }

}
