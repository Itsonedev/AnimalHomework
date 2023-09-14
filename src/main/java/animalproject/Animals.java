package animalproject;
public class Animals {
    public String species;
    public String animalSound;
    public boolean isPredator;
    public String[] breed;

    public Animals(String species, String animalSound, boolean isPredator, String[] breed){
       this.species = species;
       this.animalSound = animalSound;
       this.isPredator = isPredator;
       this.breed = breed;
    }
    public void printAnimalSound() {
        System.out.println("The " + species + " makes this sound, " + animalSound);
    }
    public void printAnimalBreed(){
        for (int i = 0; i < breed.length; i++){
            System.out.println(breed[i]);
        }

    }   public void printAnimalFav(){
        System.out.println("My favorite " + species + " is the " + breed[1] + ", it is also " + isPredator + " that it is a predator!");
    }

}
