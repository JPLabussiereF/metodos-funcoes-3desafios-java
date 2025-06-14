public class CPFValidator {
    String name;
    String cpf;

    public CPFValidator(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public void isLengthValid() {
        if (cpf.length() != 11) {
            System.out.println("Digite um CPF de 11 digitos\n");
            return;
        }
        System.out.printf("O seu cpf '%s' possui 11 digitos\n", cpf);
    }

    public void calculateCheckDigits() {
        int sumFirstDigit = 0;
        int sumSecondDigit = 0;

        for (int i = 0; i < 9; i++) {
            int aux = Character.getNumericValue(cpf.charAt(i));
            sumFirstDigit += aux * (10 - i);
        }

        sumFirstDigit %= 11;
        int valueFirstDigit;

        if (sumFirstDigit < 2) {
            valueFirstDigit = 0;
        } else {
            valueFirstDigit = 11 - sumFirstDigit;
        }

        for (int i = 0; i < 10; i++) {
            int aux = Character.getNumericValue(cpf.charAt(i));
            sumSecondDigit += aux * (11 - i);
        }

        sumSecondDigit %= 11;
        int valueSecondDigit;

        if (sumSecondDigit <2) {
            valueSecondDigit = 0;
        } else {
            valueSecondDigit = 11 - sumSecondDigit;
        }

        if (valueFirstDigit == Character.getNumericValue(cpf.charAt(9)) && valueSecondDigit == Character.getNumericValue(cpf.charAt(10))) {
            System.out.println("Seu CPF é válido!\n");
        } else {
            System.out.println("Seu CPF é inválido!\n");
        }
    }

    public void formatted(){
        System.out.printf("%s%s%s.%s%s%s.%s%s%s-%s%s\n", cpf.charAt(0), cpf.charAt(1),cpf.charAt(2),cpf.charAt(3),cpf.charAt(4),cpf.charAt(5), cpf.charAt(6), cpf.charAt(7), cpf.charAt(8),cpf.charAt(9), cpf.charAt(10));
    }

}