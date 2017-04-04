import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;

public class BookTest {

  @Rule
  public DatabaseRule databse = new DatabaseRule();

  @Test
  public void Book_instantiatesCorrectly_true() {
    Book testBook = new Book("name", 1, "author");
    assertEquals(true, testBook instanceof Book);
  }
}
