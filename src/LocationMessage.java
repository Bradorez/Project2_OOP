public class LocationMessage extends BaseMessage
{
    private String location;
    LocationMessage(String location)
    {
        //super();
        this.location=location;
    }
    public String output()
    {
        return location;
    }
}
