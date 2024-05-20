 class Software_Engineering {

         // attributes

         // Syntax = Type + name + value;

         String Name;
         String ProgrammingLanguage;
         String FavouriteCoding_Project;

         // constructor

         // Syntax of constructor = classname + ( pass the attribute) + { this.attributeName = attributeName; }

     Software_Engineering (String Name, String ProgrammingLanguage, String FavouriteCoding_Project) {
             this.Name = Name;
             this.ProgrammingLanguage = ProgrammingLanguage;
             this.FavouriteCoding_Project = FavouriteCoding_Project;

             // syntax of method = return type + method Name +() + {}

             //Name
             //ProgrammingLanguage
             //FavouriteCoding_Project
         }

         void Name () {
             System.out.println("Engineer Name...");
         }
         void ProgrammingLanguage () {
             System.out.println("Engineers fav programming language...");
         }
         void FavouriteCoding_Project () {
             System.out.println("Engineers fav programming project...");
         }
     }






