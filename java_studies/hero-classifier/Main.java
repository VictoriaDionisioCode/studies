public class Main {
    public static void main(String[] args) {

        String nome = "Heroi Valent";
        int xp = 8700; // nível mínimo de xp 
        // Estrutura de decisão para determinar o nivel do heroi

        String nivel; // Armazenar o nome e a quantidade de experiencia (XP)

        if (xp < 1000) {
            nivel = "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {
            nivel = "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {
            nivel = "Prata";
        } else if (xp >= 5001 && xp <= 7000) {
            nivel = "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            nivel = "Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }             
    // Exibir mensagem com o nome do heroi e seu nivel
    System.out.println("O heroi de nome " + nome + " esta no nivel " + nivel);
   }
}
