public class Apple extends  Plants
{
    Apple()
    {
        super();
        this.name_of_specie = "green_apple";
        this.count_of_plants = 10000;
    }
    public void me_applee()
    {
        System.out.println(this.count_of_plants);
    }
    public void print_name(int x)
    {
        System.out.println(this.count_of_plants);
    }
    public void print_name(String x)
    {
        super.print_name(x);
        System.out.println(" apple " + " " + this.name_of_specie + " " + x);
    }


//    public String toString() {
//        return "this is apple!";
//    }

}
