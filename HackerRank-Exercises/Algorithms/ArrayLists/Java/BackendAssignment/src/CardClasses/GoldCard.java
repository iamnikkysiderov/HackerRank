package CardClasses;

import Contracts.ICard;

public class GoldCard implements ICard {
    private String owner;
    private Double turnoverPreviousMonth;

    public GoldCard(String owner, Double turnoverPreviousMonth) {
        this.owner = owner;
        this.turnoverPreviousMonth = turnoverPreviousMonth;
    }

    public String owner() {
        return this.owner;
    }

    public Double turnoverPreviousMonth() {
        return this.turnoverPreviousMonth;
    }

    public Double initialDiscountRate() {
        if (CheckNumber(this.turnoverPreviousMonth)) {
            Double result = Double.parseDouble(this.turnoverPreviousMonth.toString().substring(0, 1));

            return result;
        }
        else {
            return 2.0;
        }
    }

    private static Boolean CheckNumber(Double value) {
        if (value.toString().contains(".")) {
            if (value.toString().split("\\.")[0].length() == 3) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (value.toString().length() == 3) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}