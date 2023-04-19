import javax.swing.*;

public class FileMessage extends TextMessage
{
    public String file;
    FileMessage(String file)
    {
        super("text");
        this.file = file;
    }
    @Override
    public String output()
    {
        return super.output();
    }
}
