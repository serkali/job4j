package profession;

import java.util.Date;

public class Programmer extends Engineer{
    public Programmer(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

    @Override
    public int calculate() {
        return super.calculate();
    }
}
