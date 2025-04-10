import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petmachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;

        do { 
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com Shampoo");
            System.out.println("4 - verificar água da máquina");
            System.out.println("5 - verificar Shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petmachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petmachine.removePet();
                case 9 -> petmachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }

        } while (option != 0);
    }

    private static void setWater(){
        System.out.println("Tentando colocar agua na máquina");
        petmachine.addWater();
    }
    private static void setShampoo(){
        System.out.println("Tentando colocar Shampoo na máquina... ");
        petmachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petmachine.getWater();
        System.out.println("A máquina está no momento com " + amount + " litros de água");
    }

    private static void verifyShampoo() {
        var amount = petmachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + " litros de shampoo");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petmachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petmachine.setPet(pet);
    }
}
