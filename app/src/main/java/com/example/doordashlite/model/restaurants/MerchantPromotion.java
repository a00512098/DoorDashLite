
package com.example.doordashlite.model.restaurants;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MerchantPromotion implements Parcelable
{

    @SerializedName("minimum_subtotal_monetary_fields")
    @Expose
    private MinimumSubtotalMonetaryFields minimumSubtotalMonetaryFields;
    @SerializedName("delivery_fee")
    @Expose
    private Object deliveryFee;
    @SerializedName("delivery_fee_monetary_fields")
    @Expose
    private DeliveryFeeMonetaryFields deliveryFeeMonetaryFields;
    @SerializedName("minimum_subtotal")
    @Expose
    private Object minimumSubtotal;
    @SerializedName("new_store_customers_only")
    @Expose
    private Boolean newStoreCustomersOnly;
    @SerializedName("id")
    @Expose
    private Integer id;
    public final static Parcelable.Creator<MerchantPromotion> CREATOR = new Creator<MerchantPromotion>() {


        @SuppressWarnings({
            "unchecked"
        })
        public MerchantPromotion createFromParcel(Parcel in) {
            return new MerchantPromotion(in);
        }

        public MerchantPromotion[] newArray(int size) {
            return (new MerchantPromotion[size]);
        }

    }
    ;

    protected MerchantPromotion(Parcel in) {
        this.minimumSubtotalMonetaryFields = ((MinimumSubtotalMonetaryFields) in.readValue((MinimumSubtotalMonetaryFields.class.getClassLoader())));
        this.deliveryFee = ((Object) in.readValue((Object.class.getClassLoader())));
        this.deliveryFeeMonetaryFields = ((DeliveryFeeMonetaryFields) in.readValue((DeliveryFeeMonetaryFields.class.getClassLoader())));
        this.minimumSubtotal = ((Object) in.readValue((Object.class.getClassLoader())));
        this.newStoreCustomersOnly = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public MerchantPromotion() {
    }

    public MinimumSubtotalMonetaryFields getMinimumSubtotalMonetaryFields() {
        return minimumSubtotalMonetaryFields;
    }

    public void setMinimumSubtotalMonetaryFields(MinimumSubtotalMonetaryFields minimumSubtotalMonetaryFields) {
        this.minimumSubtotalMonetaryFields = minimumSubtotalMonetaryFields;
    }

    public Object getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Object deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public DeliveryFeeMonetaryFields getDeliveryFeeMonetaryFields() {
        return deliveryFeeMonetaryFields;
    }

    public void setDeliveryFeeMonetaryFields(DeliveryFeeMonetaryFields deliveryFeeMonetaryFields) {
        this.deliveryFeeMonetaryFields = deliveryFeeMonetaryFields;
    }

    public Object getMinimumSubtotal() {
        return minimumSubtotal;
    }

    public void setMinimumSubtotal(Object minimumSubtotal) {
        this.minimumSubtotal = minimumSubtotal;
    }

    public Boolean getNewStoreCustomersOnly() {
        return newStoreCustomersOnly;
    }

    public void setNewStoreCustomersOnly(Boolean newStoreCustomersOnly) {
        this.newStoreCustomersOnly = newStoreCustomersOnly;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(minimumSubtotalMonetaryFields);
        dest.writeValue(deliveryFee);
        dest.writeValue(deliveryFeeMonetaryFields);
        dest.writeValue(minimumSubtotal);
        dest.writeValue(newStoreCustomersOnly);
        dest.writeValue(id);
    }

    public int describeContents() {
        return  0;
    }

}
