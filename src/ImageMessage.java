public class ImageMessage extends TextMessage
{
    private String image;
    ImageMessage(String im, String trxt)
    {
        super(trxt);
        this.image = im;
    }
    public String output()
    {
        return image;
    }
}
