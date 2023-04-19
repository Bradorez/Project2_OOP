public abstract class BaseMessage
{
    protected String date;
    protected String author;
    public abstract String output();
    BaseMessage()
    {
        this.date="12.04.2023";
        this.author="Andrii";

    }
}
