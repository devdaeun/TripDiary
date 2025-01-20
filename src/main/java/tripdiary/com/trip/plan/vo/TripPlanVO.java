package tripdiary.com.trip.plan.vo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
public class TripPlanVO {
    private int plan_id;
    private int user_id;
    private String trip_area;
    private String trip_location;
    private String plan_weather;
    private Date start_at;
    private Date end_at;
    private String title;
    private String content;
    private Timestamp updated_at;
    private char secret;
    private int secret_code;

    public TripPlanVO(char secret, String trip_area) {
        this.secret = 0;
        this.trip_area = "국내";
    }

}
