public class Product {

    String name;
    double price;


    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void showInfo(){
        System.out.printf("O nome do Produto é: %s\nO preço do '%s' é: %.2f\n", name, name, price);
    }

    public void applyDiscount(double discount){
        if (discount <0 || discount > 100){
            System.out.println("Desconto inválido, digite um número de 1 a 100");
            return;
        }
        double finalPrice = price * (discount / 100);
        price -= finalPrice;
        System.out.printf("O desconto de '%.2f%%' foi aplicado, agora o valor final do produto é: %.2f\n", discount,price);
    }

    public void calculateTax(double tax){
        if (tax < 0 || tax > 1000) {
            System.out.println("Imposto inválido, digite um número de 1 a 1000");
            return;
        }
        double finalPrice = price * (tax / 100);
        price += finalPrice;
        System.out.printf("O imposto de '%.2f%%' foi aplicado, agora o valor final do produto é: %.2f\n", tax, price);
    }

    public void compareProducts(Product otherProduct){
        if (this.price == otherProduct.price){
            System.out.println("O preço de ambos os produtos são iguais");
        } else if (this.price > otherProduct.price) {
            System.out.printf("O preço do produto '%s (R$ %.2f)' é maior do que o preço do produto '%s (R$ %.2f)'\n", this.name, this.price, otherProduct.name, otherProduct.price);
        } else {
            System.out.printf("O preço do produto '%s (R$ %.2f)' é menor do que o preço do produto '%s (R$ %.2f)'\n", this.name, this.price, otherProduct.name, otherProduct.price);
        }
    }
}
