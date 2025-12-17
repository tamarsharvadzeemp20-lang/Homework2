public class ChildAbstract extends ParentAbstract {
    void whatToVisit (){
        System.out.println("აუცილებლად უნდა ნახო ტოკიო, ოსაკა, ნაგოია, ნარა,ოკინავა და კიდევ სხვა ულამაზესი ადვილები");
    }
    public String CountryName;
    double budget;
    private int age;

    public void setAge (int myAge) {
        if (myAge >= 18 && myAge < 80) {
            age = myAge;
            System.out.println("შეგიძლია დამოუკიდებლად იმოგზაურო");
        }
        else {
            System.out.println( "არ შემიძლია ვიმოგზაურო დამოუკიდებლად");
        }
    }
    public void printCountryPreferences (){
        System.out.println("ქვეყანა სადაც არ მინდა რომ წავიდე სამოგზაუროდ არის  "+CountryNotToVisit+ ", ხოლო ჩემი ოცნების ქვეყანაა " + CountryName);
    }

}
