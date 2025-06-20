package homework;

public class MyPetStore {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.id = 1;
        pet1.name = "bobik";
        pet1.price = 15.50;
        pet1.ageRestriction = 15;
        pet1.isCard = false;

        pet1.pet_info();
        pet1.pet_age_restriction(14);
        pet1.isEnoughMoney(20);
    }
}

class Pet {
    int id;
    String name;
    String type;
    double price;
    int ageRestriction;
    boolean isCard;

    void pet_info(){
        System.out.println(id);
        System.out.println(name);
    }

    void pet_age_restriction(int customerAge){
        if(customerAge < ageRestriction){
            System.out.println("Извините, ваш восрост не подходит!");
        } else {
            System.out.println("Возрост подходит!");
        }
    }

    void isEnoughMoney(double budget){

        if(budget >= price){

           if (isCard){
               System.out.println("Платеж по карте!");
           } else {
               System.out.println("Наличными!");
           }

        } else {
            System.out.println("У покупателя нет достаточно денег!");
        }

        System.out.println("------------");
    }
}
