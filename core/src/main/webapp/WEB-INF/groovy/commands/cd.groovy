import org.crsh.shell.ScriptException;
import org.kohsuke.args4j.Argument;
import org.crsh.shell.Description;

@Description("Change the current directory")
public class commit extends org.crsh.shell.ClassCommand {

  @Argument(required=false,index=0,usage="The path of the node to change the current node to")
  def String path;

  public Object execute() throws ScriptException {
    assertConnected();
    def node = findNodeByPath(path);
    setCurrentNode(node);
  }
}
