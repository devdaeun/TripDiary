package tripdiary.com.trip.plan.vo;

import java.sql.Date;
import java.sql.Timestamp;

public class TripPlanVO {
    private int plan_id;
    private int user_id;
    private String tripa_area;
    private String trip_location;
    private String plan_weather;
    private Date start_at;
    private Date end_at;
    private String title;
    private String content;
    private Timestamp updated_at;
    private char secret;
    private int secret_code;

    public TripPlanVO(char secret, String tripa_area) {
        this.secret = 0;
        this.tripa_area = "국내";
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTripa_area() {
        return tripa_area;
    }

    public void setTripa_area(String tripa_area) {
        this.tripa_area = tripa_area;
    }

    public String getTrip_location() {
        return trip_location;
    }

    public void setTrip_location(String trip_location) {
        this.trip_location = trip_location;
    }

    public String getPlan_weather() {
        return plan_weather;
    }

    public void setPlan_weather(String plan_weather) {
        this.plan_weather = plan_weather;
    }

    public Date getStart_at() {
        return start_at;
    }

    public void setStart_at(Date start_at) {
        this.start_at = start_at;
    }

    public Date getEnd_at() {
        return end_at;
    }

    public void setEnd_at(Date end_at) {
        this.end_at = end_at;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public char getSecret() {
        return secret;
    }

    public void setSecret(char secret) {
        this.secret = secret;
    }

    public int getSecret_code() {
        return secret_code;
    }

    public void setSecret_code(int secret_code) {
        this.secret_code = secret_code;
    }
}
