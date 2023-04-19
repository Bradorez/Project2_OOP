public class Plants
{
    private int population_weight;
    Plants()
    {
        this.population_weight = 100;
    }
    public int count_of_plants = 0;
    private String place_on_evolution_tree = "Angiosperms";
    protected String name_of_specie = "";
    public void print_name(int x)
    {
        System.out.println(this.place_on_evolution_tree);
    }
    public void print_name(String x)
    {
        System.out.println(this.name_of_specie + " " + x);
    }
    public String toString() {
        return "this is plants " + this.name_of_specie;
    }
}
