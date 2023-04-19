public class TextMessage extends BaseMessage
{
    private String text;
    TextMessage(String t)
    {
        super();
        this.text=t;
    }
    public String output()
    {
     return text;
    }
    public void output(int x)
    {
        System.out.println(text);
    }

}
