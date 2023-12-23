public class Meteorologia {

    private String atm, hmd;

    public void setDatos (String a, String b){
        atm = a;
        hmd = b;
    }

    public String lluvia(){

        StringBuilder lv = new StringBuilder(); 

        if ((atm == "baja") & (hmd == "alta")) {
            lv.append("Muy alta");
        }
        else if ((atm == "baja") & (hmd == "media")) {
            lv.append("Alta");
        }
        else if ((atm == "baja") & (hmd == "baja")) {
            lv.append("Media");
        }
        else if ((atm == "media") & (hmd == "media")) {
            lv.append("Media");
        }
        else {
            lv.append("Baja");
        }

        return lv.toString();
    }
}
