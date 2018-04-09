package models;

/**
 * Created by Min-Pc on 3/4/2018.
 */

public class City {

    private int mCityId;
    private String mCityName;
    private String mCityCountry;
    private String mCityLanguage;
    private String mCityTransport;
    private String mCityAirport;
    private String mCityShortDesc;
    private String mCityTimeZone;
    private String mCityWeatherZone;
    private int mCityImage;

    /**
     * Default constructor with all the information
     * @param cityId
     * @param cityName
     * @param cityCountry
     * @param cityLanguage
     * @param cityTransport
     * @param cityAirport
     * @param cityShortDesc
     * @param cityTimeZone
     * @param cityWeatherZone
     * @param cityImage
     */

    public City(int cityId, String cityName, String cityCountry, String cityLanguage,
                String cityAirport, String cityTransport, String cityShortDesc,
                String cityTimeZone, String cityWeatherZone, int cityImage){

        this.mCityId = cityId;
        this.mCityName = cityName;
        this.mCityCountry = cityCountry;
        this.mCityLanguage = cityLanguage;
        this.mCityAirport = cityAirport;
        this.mCityTransport = cityTransport;
        this.mCityShortDesc = cityShortDesc;
        this.mCityTimeZone = cityTimeZone;
        this.mCityWeatherZone = cityWeatherZone;
        this.mCityImage = cityImage;
    }

    /**
     * Empty default constructor
     */

    public City(){

    }

    /**
     * Setter and Getter methods for all the parameters
     */

    public int getCityId() {
        return mCityId;
    }

    public void setCityId(int cityId) {
        mCityId = cityId;
    }

    public String getCityName() {
        return mCityName;
    }

    public void setCityName(String cityName) {
        mCityName = cityName;
    }

    public String getCityCountry() {
        return mCityCountry;
    }

    public void setCityCountry(String cityCountry) {
        mCityCountry = cityCountry;
    }

    public String getCityLanguage() {
        return mCityLanguage;
    }

    public void setCityLanguage(String cityLanguage) {
        mCityLanguage = cityLanguage;
    }

    public String getCityAirport() {
        return mCityAirport;
    }

    public void setCityAirport(String cityAirport) {
        mCityAirport = cityAirport;
    }

    public String getCityTransport() {
        return mCityTransport;
    }

    public void setCityTransport(String cityTransport) {
        mCityTransport = cityTransport;
    }

    public String getCityShortDesc() {
        return mCityShortDesc;
    }

    public void setCityShortDesc(String cityShortDesc) {
        mCityShortDesc = cityShortDesc;
    }

    public String getCityTimeZone() {
        return mCityTimeZone;
    }

    public void setCityTimeZone(String cityTimeZone) {
        mCityTimeZone = cityTimeZone;
    }

    public String getCityWeatherZone() {
        return mCityWeatherZone;
    }

    public void setCityWeatherZone(String cityWeatherZone) {
        mCityWeatherZone = cityWeatherZone;
    }

    public int getCityImage() {
        return mCityImage;
    }

    public void setCityImage(int cityImage) {
        mCityImage = cityImage;
    }
}
