import java.time.LocalDate;
import java.util.Date;

public class CreditCard {
    //private Customer Owner; prolly is not needed
    private int SerialNumber;
    private int SecurityCode;
    private LocalDate ExpDate;
    //private int Limit;
    private String Type;


    public CreditCard(int limit){
        switch (limit) {
            case 2000:
                this.Type = "regular";
                break;
            case 5000:
                this.Type = "gold";
                break;
            case 10000:
                this.Type = "platinum";
                break;
        }
        this.SerialNumber = Utils.generateSerialNumber();
        this.SecurityCode = Utils.generateSecurityCode();
        this.ExpDate = Utils.generateExpDate();
    }

    static String getType(CreditCard c) {
        return c.Type;
    }

    static int getSerialNumber(CreditCard c) {
        return c.SerialNumber;
    }
    static int getSecurityCode(CreditCard c) {
        return c.SecurityCode;
    }
    static LocalDate getExpDate(CreditCard c) {
        return c.ExpDate;
    }

}



