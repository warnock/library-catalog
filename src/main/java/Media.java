import org.sql2o.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;

public class Media {
  public String name;
  public int patronId;
  public int id;
  public String type;
  public Timestamp checkedOut;

  public static final int MAX_CHECKOUT_LEVEL = 3; //add exception if checkout level exceeds 3
  public static final int MAX_RENEW_LEVEL = 2;

  public String getName() {
    return name;
  }

  public int getPatronId() {
    return patronId;
  }

  public int getId() {
    return id;
  }


  @Override
  public boolean equals(Object otherMedia) {
    if (!(otherMedia instanceof Media)) {
      return false;
    } else {
      Media newMedia = (Media) otherMedia;
      return this.getName().eqals(newMedia.getName()) &&
        this.getpatronId() == newMedia.getPatronId();
    }
  }


}
