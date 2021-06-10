package dto;

/*
    app/PeopleApp
 */
public class People {
   String name,addres;

   public People(String name, String addres){
       this.name = name;
       this.addres = addres;
   }

   public  People(String name){
       this(name,null);
   }

//   mereferensi dari construct diatasnya.
   public People(){
       this(null);
   }

   public void sayHello(String name){
       System.out.println("Hello "+name+" nama saya "+this.name+" saya tinggal di "+this.addres);
   }
}
