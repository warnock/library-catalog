import org.junit.rules.ExternalResource;
import org.sql2o.*;

public class DatabaseRule extends ExternalResource {

  @Override
  protected void before() {
    DB.sql2o = new Sql2o("jbdc:postgresql://localhost:5432/library_catalog_test", null, null);
  }

  @Override
  protected void after() {
    try(Connection con = DB.sql2o.open()) {
      // String deleteBookQuery = "DELETE FROM books *;";
      // con.createQuery(deleteBookQuery).executeUpdate();
      // String deletePatronQuery = "DELETE FROM patrons *;";
      // con.createQuery(deletePatronQuery).executeUpdate();
      String deleteMediaQuery = "DELETE FROM medias *;";
      con.createQuery(deleteMediaQuery).executeUpdate();
    }
  }
}
