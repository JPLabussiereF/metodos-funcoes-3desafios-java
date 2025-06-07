public static void main(String[] args) {

//    Rectangle rectangle = new Rectangle(7.0,10.0);
//    System.out.printf("A base do retângulo é: %f\n", rectangle.base);
//    System.out.printf("A altura do retângulo é: %f\n", rectangle.height);
//    System.out.printf("A área do retângulo é: %f\n", rectangle.calculateArea());
//    System.out.printf("O perímetro do retângulo é: %f\n", rectangle.calculatePerimeter());
//    System.out.printf("O retângulo é quadrado?: %b\n", rectangle.isSquare());
//
//    System.out.println();
//
//    Product p1 = new Product("Mouse", 90);
//    p1.showInfo();
//
//    Product p2 = new Product("Teclado", 250);
//    p2.showInfo();
//
//    p1.compareProducts(p2);
//    p2.compareProducts(p1);
//
//    p1.applyDiscount(20.1);
//    p2.applyDiscount(-1);
//
//    p1.calculateTax(1001);
//    p2.calculateTax(100);

    CPFValidator cpf1 =new CPFValidator("julio", "86588340508");

    cpf1.isLengthValid();
    cpf1.calculateCheckDigits();


}
