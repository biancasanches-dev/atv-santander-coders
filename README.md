# Utilitário de Conversão de Moedas

## Descrição
A classe `UtilitarioConversaoDeMoedas` fornece métodos para converter valores entre Real (BRL) e várias outras moedas (USD, EUR, GBP e BTC). É uma classe utilitária simples que pode ser usada para cálculos financeiros básicos.

## Tecnologias
- Java 17
- IntelliJ IDE

## Estrutura da Classe

### Enum `Moeda`
Representa os tipos de moedas suportadas:
- `DOLAR`
- `EURO`
- `LIBRA`
- `BITCOIN`

### Constantes
Valores fixos das taxas de câmbio para as moedas suportadas:
- `VALOR_DOLAR`: 5.66
- `VALOR_EURO`: 6.19
- `VALOR_LIBRA`: 7.18
- `VALOR_BITCOIN`: 321432.20

### Métodos

#### `converterRealParaMoeda(double valorEmReal, Moeda moeda)`
Converte um valor em Reais (BRL) para a moeda especificada.

**Parâmetros:**
- `valorEmReal`: Valor em Reais a ser convertido.
- `moeda`: A moeda para a qual o valor será convertido.

**Retorna:**
- O valor convertido na moeda especificada.

**Exceção:**
- `IllegalArgumentException` se a moeda não for suportada.

#### `converterMoedaParaReal(double valorEmMoeda, Moeda moeda)`
Converte um valor de uma moeda especificada para Reais (BRL).

**Parâmetros:**
- `valorEmMoeda`: Valor na moeda especificada a ser convertido.
- `moeda`: A moeda do valor a ser convertido.

**Retorna:**
- O valor convertido em Reais.

**Exceção:**
- `IllegalArgumentException` se a moeda não for suportada.

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        double valorEmReais = 100;
        
        double valorEmDolar = UtilitarioConversaoDeMoedas.converterRealParaMoeda(valorEmReais, UtilitarioConversaoDeMoedas.Moeda.DOLAR);
        System.out.printf("O valor de %.2f Reais em Dólar é: %.2f\n", valorEmReais, valorEmDolar);

        double valorEmEuros = UtilitarioConversaoDeMoedas.converterRealParaMoeda(valorEmReais, UtilitarioConversaoDeMoedas.Moeda.EURO);
        System.out.printf("O valor de %.2f Reais em Euro é: %.2f\n", valorEmReais, valorEmEuros);

        double valorEmReaisConvertido = UtilitarioConversaoDeMoedas.converterMoedaParaReal(valorEmDolar, UtilitarioConversaoDeMoedas.Moeda.DOLAR);
        System.out.printf("O valor de %.2f Dólares em Reais é: %.2f\n", valorEmDolar, valorEmReaisConvertido);
    }
}
```

## Observações
- Este utilitário usa valores de câmbio fixos definidos nas constantes da classe. Em um cenário real, é recomendável obter taxas de câmbio atualizadas de uma API de câmbio.
- A implementação atual é uma versão simplificada e serve apenas para fins educacionais e de teste.

---

Esse README básico descreve a funcionalidade da classe `UtilitarioConversaoDeMoedas`, como usá-la e inclui um exemplo de código para ajudar a começar.
