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
  public int personId;
  public int id;

  public static final int MAX_CHECKOUT_LEVEL = 3; //add exception if checkout level exceeds 3
  public static final int MAX_RENEW_LEVEL = 2;


}
