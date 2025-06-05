# Funções e Métodos em Java

## 🎯 Introdução

Em Java, **não existem funções isoladas** como em linguagens procedurais. Tudo são **métodos** que pertencem a classes. Um método é um bloco de código reutilizável que executa uma tarefa específica.

## 🔍 Conceitos Fundamentais

### Método vs Função
- **Função**: Bloco de código independente (C, Python, JavaScript)
- **Método**: Função que pertence a uma classe (Java, C#)

### Por que usar métodos?
- ✅ **Reutilização** de código
- ✅ **Organização** e modularidade
- ✅ **Facilita manutenção**
- ✅ **Reduz repetição**

## 🏗️ Estrutura de um Método

```java
modificadorDeAcesso tipoRetorno nomeDoMetodo(tipoParametro parametro) {
    // Corpo do método
    return valor; // Se necessário
}
```

### Componentes:

| Componente | Descrição | Exemplos |
|------------|-----------|----------|
| **Modificador de Acesso** | Define visibilidade | `public`, `private`, `protected` |
| **Tipo de Retorno** | O que o método retorna | `void`, `int`, `String`, `boolean` |
| **Nome do Método** | Identificador único | `calcular`, `obterNome`, `isValid` |
| **Parâmetros** | Dados de entrada | `(int idade)`, `(String nome, int id)` |

## 🎭 Tipos de Métodos

### 1. Métodos de Instância
Precisam de um objeto para serem chamados.

```java
public class Pessoa {
    private String nome;
    
    // Método de instância
    public void falar() {
        System.out.println(nome + " está falando...");
    }
}

// Uso:
Pessoa pessoa = new Pessoa();
pessoa.falar(); // Chamada através do objeto
```

### 2. Métodos Estáticos
Pertencem à classe, não ao objeto.

```java
public class Calculadora {
    // Método estático
    public static int somar(int a, int b) {
        return a + b;
    }
}

// Uso:
int resultado = Calculadora.somar(5, 3); // Chamada direta pela classe
```

### 3. Métodos com Retorno vs Void

#### Método Void (sem retorno)
```java
public void exibirMensagem(String mensagem) {
    System.out.println("Mensagem: " + mensagem);
}
```

#### Método com Retorno
```java
public double calcularArea(double raio) {
    return Math.PI * raio * raio;
}
```

## 💡 Exemplos Práticos

### Exemplo 1: Classe Básica com Métodos
```java
public class ContaBancaria {
    private double saldo;
    private String titular;
    
    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Saldo atual: R$ " + saldo);
        }
    }
    
    // Método para sacar
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: R$ " + saldo);
            return true;
        }
        return false;
    }
    
    // Método getter
    public double getSaldo() {
        return saldo;
    }
    
    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}
```

### Exemplo 2: Métodos Estáticos Utilitários
```java
public class MathUtils {
    
    // Método para calcular fatorial
    public static long fatorial(int n) {
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }
    
    // Método para verificar se é par
    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }
    
    // Método para encontrar o maior
    public static int maior(int a, int b) {
        return (a > b) ? a : b;
    }
}
```

### Exemplo 3: Uso dos Métodos
```java
public class Main {
    public static void main(String[] args) {
        // Usando métodos de instância
        ContaBancaria conta = new ContaBancaria("João", 1000.0);
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.exibirInfo();
        
        // Usando métodos estáticos
        System.out.println("5! = " + MathUtils.fatorial(5));
        System.out.println("10 é par? " + MathUtils.isPar(10));
        System.out.println("Maior entre 15 e 23: " + MathUtils.maior(15, 23));
    }
}
```

## ✨ Boas Práticas

### 1. Nomenclatura
- Use **camelCase**: `calcularIdade()`, `obterNome()`
- Seja **descritivo**: `validarEmail()` em vez de `validar()`
- Verbos para ações: `executar()`, `processar()`

### 2. Responsabilidade Única
```java
// ❌ Método fazendo muitas coisas
public void processarUsuario(String nome, String email) {
    // validar dados
    // salvar no banco
    // enviar email
    // gerar relatório
}

// ✅ Métodos específicos
public boolean validarDados(String nome, String email) { /* ... */ }
public void salvarUsuario(Usuario usuario) { /* ... */ }
public void enviarEmail(String email) { /* ... */ }
```

### 3. Parâmetros
- **Limite**: máximo 3-4 parâmetros
- **Ordem lógica**: mais importantes primeiro
- **Use objetos** para muitos parâmetros

### 4. Retornos
- **Seja consistente** com tipos de retorno
- **Evite null** quando possível
- **Use Optional** para valores que podem não existir

## 🏋️ Exercícios

### [Exercício 1: Básico](src/main/java/Rectangle.java)
Crie uma classe `Retangulo` com métodos para:
- Calcular área
- Calcular perímetro
- Verificar se é quadrado

### [Exercício 2: Intermediário](src/main/java/Product.java)
Crie uma classe `Produto` com métodos para:
- Aplicar desconto
- Calcular preço com imposto
- Comparar preços entre produtos

### [Exercício 3: Avançado - Em Construção](src/main/java/CPFValidator.java) 
Crie uma classe `ValidadorCPF` com métodos estáticos para:
- Validar formato
- Calcular dígitos verificadores
- Formatar CPF

