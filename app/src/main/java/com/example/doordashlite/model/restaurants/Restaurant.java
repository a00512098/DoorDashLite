
package com.example.doordashlite.model.restaurants;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Restaurant implements Parcelable
{

    @SerializedName("is_time_surging")
    @Expose
    private Boolean isTimeSurging;
    @SerializedName("max_order_size")
    @Expose
    private Integer maxOrderSize;
    @SerializedName("delivery_fee")
    @Expose
    private Integer deliveryFee;
    @SerializedName("max_composite_score")
    @Expose
    private Integer maxCompositeScore;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("merchant_promotions")
    @Expose
    private List<MerchantPromotion> merchantPromotions = null;
    @SerializedName("average_rating")
    @Expose
    private Float averageRating;
    @SerializedName("menus")
    @Expose
    private List<Menu> menus = null;
    @SerializedName("composite_score")
    @Expose
    private Integer compositeScore;
    @SerializedName("status_type")
    @Expose
    private String statusType;
    @SerializedName("is_only_catering")
    @Expose
    private Boolean isOnlyCatering;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("number_of_ratings")
    @Expose
    private Integer numberOfRatings;
    @SerializedName("asap_time")
    @Expose
    private Object asapTime;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("business")
    @Expose
    private Business business;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("yelp_review_count")
    @Expose
    private Integer yelpReviewCount;
    @SerializedName("business_id")
    @Expose
    private Integer businessId;
    @SerializedName("extra_sos_delivery_fee")
    @Expose
    private Integer extraSosDeliveryFee;
    @SerializedName("yelp_rating")
    @Expose
    private Float yelpRating;
    @SerializedName("cover_img_url")
    @Expose
    private String coverImgUrl;
    @SerializedName("header_img_url")
    @Expose
    private String headerImgUrl;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("is_newly_added")
    @Expose
    private Boolean isNewlyAdded;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("service_rate")
    @Expose
    private Integer serviceRate;
    @SerializedName("promotion")
    @Expose
    private Object promotion;
    @SerializedName("featured_category_description")
    @Expose
    private Object featuredCategoryDescription;
    public final static Parcelable.Creator<Restaurant> CREATOR = new Creator<Restaurant>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        public Restaurant[] newArray(int size) {
            return (new Restaurant[size]);
        }

    }
    ;

    protected Restaurant(Parcel in) {
        this.isTimeSurging = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.maxOrderSize = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.deliveryFee = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.maxCompositeScore = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.merchantPromotions, (com.example.doordashlite.model.restaurants.MerchantPromotion.class.getClassLoader()));
        this.averageRating = ((Float) in.readValue((Float.class.getClassLoader())));
        in.readList(this.menus, (com.example.doordashlite.model.restaurants.Menu.class.getClassLoader()));
        this.compositeScore = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.statusType = ((String) in.readValue((String.class.getClassLoader())));
        this.isOnlyCatering = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.numberOfRatings = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.asapTime = ((Object) in.readValue((Object.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.business = ((Business) in.readValue((Business.class.getClassLoader())));
        in.readList(this.tags, (java.lang.String.class.getClassLoader()));
        this.yelpReviewCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.businessId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.extraSosDeliveryFee = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.yelpRating = ((Float) in.readValue((Float.class.getClassLoader())));
        this.coverImgUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.headerImgUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.address = ((Address) in.readValue((Address.class.getClassLoader())));
        this.priceRange = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.isNewlyAdded = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.serviceRate = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.promotion = ((Object) in.readValue((Object.class.getClassLoader())));
        this.featuredCategoryDescription = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Restaurant() {
    }

    public Boolean getIsTimeSurging() {
        return isTimeSurging;
    }

    public void setIsTimeSurging(Boolean isTimeSurging) {
        this.isTimeSurging = isTimeSurging;
    }

    public Integer getMaxOrderSize() {
        return maxOrderSize;
    }

    public void setMaxOrderSize(Integer maxOrderSize) {
        this.maxOrderSize = maxOrderSize;
    }

    public Integer getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Integer deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Integer getMaxCompositeScore() {
        return maxCompositeScore;
    }

    public void setMaxCompositeScore(Integer maxCompositeScore) {
        this.maxCompositeScore = maxCompositeScore;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<MerchantPromotion> getMerchantPromotions() {
        return merchantPromotions;
    }

    public void setMerchantPromotions(List<MerchantPromotion> merchantPromotions) {
        this.merchantPromotions = merchantPromotions;
    }

    public Float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Float averageRating) {
        this.averageRating = averageRating;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Integer getCompositeScore() {
        return compositeScore;
    }

    public void setCompositeScore(Integer compositeScore) {
        this.compositeScore = compositeScore;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public Boolean getIsOnlyCatering() {
        return isOnlyCatering;
    }

    public void setIsOnlyCatering(Boolean isOnlyCatering) {
        this.isOnlyCatering = isOnlyCatering;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public Object getAsapTime() {
        return asapTime;
    }

    public void setAsapTime(Object asapTime) {
        this.asapTime = asapTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getYelpReviewCount() {
        return yelpReviewCount;
    }

    public void setYelpReviewCount(Integer yelpReviewCount) {
        this.yelpReviewCount = yelpReviewCount;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getExtraSosDeliveryFee() {
        return extraSosDeliveryFee;
    }

    public void setExtraSosDeliveryFee(Integer extraSosDeliveryFee) {
        this.extraSosDeliveryFee = extraSosDeliveryFee;
    }

    public Float getYelpRating() {
        return yelpRating;
    }

    public void setYelpRating(Float yelpRating) {
        this.yelpRating = yelpRating;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public String getHeaderImgUrl() {
        return headerImgUrl;
    }

    public void setHeaderImgUrl(String headerImgUrl) {
        this.headerImgUrl = headerImgUrl;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsNewlyAdded() {
        return isNewlyAdded;
    }

    public void setIsNewlyAdded(Boolean isNewlyAdded) {
        this.isNewlyAdded = isNewlyAdded;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(Integer serviceRate) {
        this.serviceRate = serviceRate;
    }

    public Object getPromotion() {
        return promotion;
    }

    public void setPromotion(Object promotion) {
        this.promotion = promotion;
    }

    public Object getFeaturedCategoryDescription() {
        return featuredCategoryDescription;
    }

    public void setFeaturedCategoryDescription(Object featuredCategoryDescription) {
        this.featuredCategoryDescription = featuredCategoryDescription;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(isTimeSurging);
        dest.writeValue(maxOrderSize);
        dest.writeValue(deliveryFee);
        dest.writeValue(maxCompositeScore);
        dest.writeValue(id);
        dest.writeList(merchantPromotions);
        dest.writeValue(averageRating);
        dest.writeList(menus);
        dest.writeValue(compositeScore);
        dest.writeValue(statusType);
        dest.writeValue(isOnlyCatering);
        dest.writeValue(status);
        dest.writeValue(numberOfRatings);
        dest.writeValue(asapTime);
        dest.writeValue(description);
        dest.writeValue(business);
        dest.writeList(tags);
        dest.writeValue(yelpReviewCount);
        dest.writeValue(businessId);
        dest.writeValue(extraSosDeliveryFee);
        dest.writeValue(yelpRating);
        dest.writeValue(coverImgUrl);
        dest.writeValue(headerImgUrl);
        dest.writeValue(address);
        dest.writeValue(priceRange);
        dest.writeValue(slug);
        dest.writeValue(name);
        dest.writeValue(isNewlyAdded);
        dest.writeValue(url);
        dest.writeValue(serviceRate);
        dest.writeValue(promotion);
        dest.writeValue(featuredCategoryDescription);
    }

    public int describeContents() {
        return  0;
    }

}
