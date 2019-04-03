
package com.example.doordashlite.model.restaurants;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeliveryFeeMonetaryFields implements Parcelable
{

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("display_string")
    @Expose
    private String displayString;
    @SerializedName("unit_amount")
    @Expose
    private Object unitAmount;
    @SerializedName("decimal_places")
    @Expose
    private Integer decimalPlaces;
    public final static Parcelable.Creator<DeliveryFeeMonetaryFields> CREATOR = new Creator<DeliveryFeeMonetaryFields>() {


        @SuppressWarnings({
            "unchecked"
        })
        public DeliveryFeeMonetaryFields createFromParcel(Parcel in) {
            return new DeliveryFeeMonetaryFields(in);
        }

        public DeliveryFeeMonetaryFields[] newArray(int size) {
            return (new DeliveryFeeMonetaryFields[size]);
        }

    }
    ;

    protected DeliveryFeeMonetaryFields(Parcel in) {
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
        this.displayString = ((String) in.readValue((String.class.getClassLoader())));
        this.unitAmount = ((Object) in.readValue((Object.class.getClassLoader())));
        this.decimalPlaces = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public DeliveryFeeMonetaryFields() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public Object getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(Object unitAmount) {
        this.unitAmount = unitAmount;
    }

    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(currency);
        dest.writeValue(displayString);
        dest.writeValue(unitAmount);
        dest.writeValue(decimalPlaces);
    }

    public int describeContents() {
        return  0;
    }

}
