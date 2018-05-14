import java.io.StringWriter;
import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class VMMacro {

  public static void main(String[] args) throws Exception {
    Velocity.init();
    Template t = Velocity.getTemplate("./src/macro_html.vm");

    VelocityContext ctx = new VelocityContext();

    Writer writer = new StringWriter();
    t.merge(ctx, writer);

    System.out.println(writer);
  }
}