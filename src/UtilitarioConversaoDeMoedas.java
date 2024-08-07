public class UtilitarioConversaoDeMoedas {

    public enum Moeda {
        DOLAR,
        EURO,
        LIBRA,
        BITCOIN

    }

    private static final double VALOR_DOLAR  = 5.66;
    private static final double VALOR_EURO = 6.19;
    private static final double VALOR_LIBRA  = 7.18;
    private static final double VALOR_BITCOIN  = 321432.20;

    public static double converterRealParaMoeda(double valorEmReal, Moeda moeda) {
        return switch (moeda) {
            case DOLAR -> valorEmReal / VALOR_DOLAR;
            case EURO -> valorEmReal / VALOR_EURO;
            case LIBRA -> valorEmReal / VALOR_LIBRA;
            case BITCOIN -> valorEmReal / VALOR_BITCOIN;
            default -> throw new IllegalArgumentException("Moeda não suportada");
        };
    }

    public static double converterMoedaParaReal(double valorEmMoeda, Moeda moeda) {
        return switch (moeda) {
            case DOLAR -> valorEmMoeda * VALOR_DOLAR;
            case EURO -> valorEmMoeda * VALOR_EURO;
            case LIBRA -> valorEmMoeda * VALOR_LIBRA;
            case BITCOIN -> valorEmMoeda * VALOR_BITCOIN;
            default -> throw new IllegalArgumentException("Moeda não suportada");
        };
    }
}