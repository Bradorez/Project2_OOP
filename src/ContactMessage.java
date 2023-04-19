public class ContactMessage extends BaseMessage
{
    private String contact;
    ContactMessage(String contact)
    {
        //super();
        this.contact=contact;
    }
    public String output()
    {
        return contact;
    }
}
