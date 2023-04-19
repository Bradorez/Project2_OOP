public class VoiceMessage extends BaseMessage
{
    private String voice;
    VoiceMessage(String v)
    {
        //super();
        this.voice=v;
    }
    public String output()
    {
        return voice;
    }
}
