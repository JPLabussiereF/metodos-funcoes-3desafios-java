public class CPFValidator {
    String name;
    String cpf;

    public CPFValidator(String name, String cpf){
        this.name = name;
        this.cpf = cpf;
    }

    public void isLengthValid(){
        if (cpf.length() != 11){
            System.out.println("Digite um CPF de 11 digitos");
            return;
        }
        System.out.printf("O seu cpf '%s' possui 11 digitos", cpf);
    }



}
