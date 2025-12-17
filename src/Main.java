public class Main {
    private static Object child1;

    public static void main (String[] args){
        //გამოიყენე მემკვიდრეობა. შექმენი მშობელი კლასი Person, სადაც იქნება ორი
        //ატრიბუტი name და age და მეთოდი printInfo(), რომელიც დაბეჭდავს სახელს და ასაკს.
        //შემდეგ შექმენი შვილი კლასი Student, რომელიც Person კლასიდან მემკვიდრეობით
        //მიიღებს ორივე ატრიბუტს (name და age) და ასევე ექნება თავისი საკუთარი
        //დამატებითი ატრიბუტი courseName და მეთოდი printStudentInfo(), რომელიც
        //დაბეჭდავს სტუდენტის სრულ ინფორმაციას (სახელი, ასაკი და კურსის სახელი).
        //ბოლოს კი main მეთოდში შექმენი Student კლასის ობიექტი, ყველა ატრიბუტს მიანიჭე
        //მნიშვნელობა და გამოიძახე ორივე მეთოდი printInfo() და printStudentInfo().
        Student  student1 = new Student();
        student1.name = "თამარი";
        student1.age = 28;
        student1.courseName = "ავტომატიზაციის ტესტირება";
       student1.printInfo();
       student1.printStudentInfo();
       //შექმენი მშობელი კლასი Animal, სადაც გექნება მეთოდი makeSound(). შემდეგ
        //შექმენი Animal კლასის რომელიმე შვილი კლასი სადაც makeSound() მეთოდს
        //გაუკეთებ overriding -ს. ბოლოს main -ში შექმენი შვილი კლასის ობიექტი და
        //დარწმუნდი რომ ოვერრაიდინგი წარმატებით მუშაობს.
       Dogs dog1 = new Dogs();
       dog1.makeSound();
       //შექმენი int ტიპის მასივი მინიმუმ 6 ელემენტით, სადაც შეინახავ სტუდენტების ქულებს.
        //for ციკლით გადაუარე მასივის ყოველ ელემენტს და დაბეჭდე მხოლოდ ის ქულები,
        //რომელიც მეტი არის 75 -ზე.
       int [] studentScore = {55,77, 12, 86,100,57};
       for (int i = 0; i < studentScore.length; i++) {
           if (studentScore[i] < 75)
               continue;
           System.out.println(studentScore[i]);

       }
       //შექმენით აბსტრაქტული კლასი, სადაც გექნებათ როგორც ჩვეულებრივი მეთოდები,
        //ასევე აბსტრაქტული მეთოდებიც. შვილ კლასში განახორციელეთ მშობელი კლასის
        //აბსტრაქტული მეთოდები. ასევე შვილ კლასში შემოიტანეთ 3 ცვლადი, ერთი public,
        //ერთი default, ერთი private. შექმენით შვილი კლასის ობიექტი მეინში და და ამ private
        //ცვლადს მიწვდით public setter -ით.
       ChildAbstract child1 = new ChildAbstract();
       child1.CountryNotToVisit = "ავღანეთი";
       child1.CountryName = "იაპონია";
       child1.budget= 10000;
       child1.printCountryPreferences();
       child1.whatToVisit();
       child1.setAge(28);
        //შექმენით კლასი, რომელსაც ეყოლება 3 მშობელი ინტერფეისების სახით. სამივე
        //ინტერფეისში აღწერეთ მინიმუმ ერთი მეთოდი, რომლებსაც შემდეგ შვილ კლასში
        //გაუკეთებთ ოვერრაიდინგს. ბოლოს main -ში შექმენი შვილი კლასის ობიექტი და
        //დარწმუნდი რომ ოვერრაიდინგი წარმატებით მუშაობს.
        foodPreferences food1 = new foodPreferences();
        food1.printFood();
        food1.favFruit();
        food1.favVeggies();

       //შექმენით კლასი სადაც განახორციელებთ ოვერლოადინგს. ამ კლასში შექმენით ორი
        //მეთოდი, void -იანი, არა სტატიკური და თან პარამეტრიანი. პირველმა მეთოდმა int
        //ტიპის მასივი მიიღოს არგუმენტად, for ციკლით გადაურბინოს მასივის ელემენტს და
        //დაბეჭდოს ყოველი მათგანი. მეორე მეთოდმა String ტიპის მასივი მიიღოს
        //არგუმენტად, for ციკლით გადაურბინოს მასივის ელემენტს და დაბეჭდოს ყოველი
        //მათგანი. შემდეგ შექმენით ამ კლასის ობიექტი, გამოიძახეთ ორივე მეთოდი, ერთს
        //გადაეცით int ტიპის მასივი არგუმენტად, მეორეს String ტიპის მასივი.
        ClassForOverloading LastTask = new ClassForOverloading();
        int [] age = {28,30, 29,35};
        String[] names= {"Tamar","Mariam","Gvantsa","Qristine"};
        LastTask.studentsInfo(age);
        LastTask.studentInfo(names);



    }




}
