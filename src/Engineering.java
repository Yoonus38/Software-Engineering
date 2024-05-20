 class Engineering {
     public static void main(String[] args) {

         //syntax of creating abject = Class name + abject name + new class name + ();
         Software_Engineering obj1 = new Software_Engineering("Yoonus", "JAVA", "Student management system");
         Software_Engineering obj2 = new Software_Engineering("Usman", "Python", "Hospital management system");

         System.out.println(obj1.Name);
         System.out.println(obj1.ProgrammingLanguage);
         System.out.println(obj1.FavouriteCoding_Project);

         System.out.println(obj2.Name);
         System.out.println(obj2.ProgrammingLanguage);
         System.out.println(obj2.FavouriteCoding_Project);


     }
 }