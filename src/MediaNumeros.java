public class MediaNumeros {
    public static void main(String[] args) {
        int soma = 0;
        int counter = 1;
        double media = 0;
        while(counter <= 1000) {
            soma += counter;
            counter += 2;
        }
        media = soma / counter;
        System.out.println(media);
    }
}