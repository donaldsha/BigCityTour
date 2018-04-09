package models;

public class Places {

    private int mPlaceId;
    private String mCityName;
    private String mPlaceName;
    private String mPlaceType;
    private String mPlaceShortDesc;
    private String mPlaceDesc;
    private String mPlaceWebsite;
    private String mPlaceImage;
    private int mPlaceBookmark;

    /**
     * Default constructor with all the parameters
     * @param placeId
     * @param cityName
     * @param placeName
     * @param placeType
     * @param placeShortDesc
     * @param placeDesc
     * @param placeWebsite
     * @param placeBookmark
     * @param placeImage
     */

    public Places(int placeId, String cityName, String placeName, String placeType,
                  String placeShortDesc, String placeDesc, String placeWebsite,
                  int placeBookmark ,String placeImage) {

        mPlaceId = placeId;
        mCityName = cityName;
        mPlaceName = placeName;
        mPlaceType = placeType;
        mPlaceShortDesc = placeShortDesc;
        mPlaceDesc = placeDesc;
        mPlaceWebsite = placeWebsite;
        mPlaceImage = placeImage;
        mPlaceBookmark = placeBookmark;
    }

    /**
     * Default constructor with parameters
     * @param placeId
     * @param placeName
     * @param placeDesc
     * @param placeWebsite
     * @param placeBookmark
     * @param placeImage
     */

    public Places(int placeId, String placeName, String placeDesc, String placeWebsite,
                  int placeBookmark ,String placeImage) {

        mPlaceId = placeId;
        mPlaceName = placeName;
        mPlaceDesc = placeDesc;
        mPlaceWebsite = placeWebsite;
        mPlaceImage = placeImage;
        mPlaceBookmark = placeBookmark;
    }


    /**
     * Default constructor with parameters
     * @param placeId
     * @param placeName
     * @param placeShortDesc
     * @param placeWebsite
     * @param placeImage
     */

    public Places(int placeId, String placeName, String placeShortDesc, String placeWebsite,
                  String placeImage) {

        mPlaceId = placeId;
        mPlaceName = placeName;
        mPlaceShortDesc = placeShortDesc;
        mPlaceWebsite = placeWebsite;
        mPlaceImage = placeImage;

    }

    /**
     * Empty constructor
     */

    public Places(){

    }

    /**
     * Getter and Setter methods of the parameters
     */

    public int getPlaceId() {
        return mPlaceId;
    }

    public void setPlaceId(int placeId) {
        mPlaceId = placeId;
    }

    public String getCityName() {
        return mCityName;
    }

    public void setCityName(String cityName) {
        mCityName = cityName;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public void setPlaceName(String placeName) {
        mPlaceName = placeName;
    }

    public String getPlaceType() {
        return mPlaceType;
    }

    public void setPlaceType(String placeType) {
        mPlaceType = placeType;
    }

    public String getPlaceShortDesc() {
        return mPlaceShortDesc;
    }

    public void setPlaceShortDesc(String placeShortDesc) {
        mPlaceShortDesc = placeShortDesc;
    }

    public String getPlaceDesc() {
        return mPlaceDesc;
    }

    public void setPlaceDesc(String placeDesc) {
        mPlaceDesc = placeDesc;
    }

    public String getPlaceWebsite() {
        return mPlaceWebsite;
    }

    public void setPlaceWebsite(String placeWebsite) {
        mPlaceWebsite = placeWebsite;
    }

    public String getPlaceImage() {
        return mPlaceImage;
    }

    public void setPlaceImage(String placeImage) {
        mPlaceImage = placeImage;
    }

    public int getPlaceBookmark() {
        return mPlaceBookmark;
    }

    public void setPlaceBookmark(int placeBookmark) {
        mPlaceBookmark = placeBookmark;
    }
}
