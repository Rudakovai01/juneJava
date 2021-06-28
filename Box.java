package HW_3;

public class Box <T extends Number> {
    Fruit fruit;
    Integer numberOfFruit;

    public Box(Fruit fruit, Integer numberOfFruit) {
        this.fruit = fruit;
        this.numberOfFruit = numberOfFruit;
    }

    public Number getFruitWeight () {
        //System.out.println("Эта коробка c фруктом "+ fruit.type + " весит " + this.numberOfFruit*this.fruit.getWeight() +" единиц. " );
        return this.numberOfFruit*this.fruit.getWeight();
    }

    public boolean compare(Box box) {
        return this.getFruitWeight() == box.getFruitWeight();
    }
    public Number pourFruits(Box box, int x){
        System.out.println("В новой коробке " + (box.numberOfFruit+x) + " , а в старой " + (this.numberOfFruit - x));
        return (this.numberOfFruit - x) + box.numberOfFruit+x;

    }
    public void putFruits(int y){
        System.out.println("В коробку пересыпали " + y + " фруктов типа " + fruit.type);
        System.out.println("Теперь в этой коробке " + (this.numberOfFruit+y) + " фруктов типа "+ fruit.type);

    }

}
