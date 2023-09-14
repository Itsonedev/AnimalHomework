package animalproject;

public class Main {
    public static void main(String[] args) {
        String bearBreed[] = {"Polar", "Grizzly", "Black"};
        String catBreed[] = {"Cheetah", "Jaguar", "Puma"};
        String snakeBreed[] = {"Cobra", "Mamba", "Anaconda"};
        String dogBreed[] = {"Poodle", "Boxer", "Rottweiler"};

        Animals bear = new Animals("Bear", "Roar!", true, bearBreed);
        Animals bigCat = new Animals("Cat", "Meow!", true, catBreed);
        Animals snake = new Animals("Snake", "Hssss!", true, snakeBreed);
        Animals dog = new Animals("Dog", "Woof!", false, dogBreed);

        bear.printAnimalFav();
        bear.printAnimalSound();
        bigCat.printAnimalFav();
        bigCat.printAnimalSound();
        snake.printAnimalFav();
        snake.printAnimalSound();
        dog.printAnimalFav();
        dog.printAnimalSound();
    }
}
