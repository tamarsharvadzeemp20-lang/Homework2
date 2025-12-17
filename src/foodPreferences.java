public class foodPreferences implements Parent1,Parent2,Parent3 {
   public void printFood () {
        System.out.println("My favourit food is Achma");
    }

    @Override
    public void favFruit() {
        System.out.println("My favourit fruit is banana");
    }

    @Override
    public void favVeggies() {
        System.out.println("Probably my fav vegetable is carrot");

    }
}
