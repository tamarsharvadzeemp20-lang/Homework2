public class ClassForOverloading {
   public void studentsInfo (int [] age) {
       for (int i=0; i < age.length; i++){
           System.out.println(age[i]);
       }

   }
   public void studentInfo (String [] names) {
       for (int i=0; i< names.length; i++){
           System.out.println(names[i]);
       }
   }
}
