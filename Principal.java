public class Principal {
    
    public static void main(String[] args) {
        Dog dog = new Dog("nina", 7);
    
        System.out.println(dog.getNome());
        System.out.println(dog.getIdade());

        Cat cat = new Cat("Barelis", 16);

        System.out.println(cat.getNome());
        System.out.println(cat.getIdade());
    }
}
