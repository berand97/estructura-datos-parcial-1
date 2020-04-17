
public class Main {
    static int matriz[][] = { { 0, 1, 0, 1, 0 }, { 1, 0, 1, 1, 1 }, { 0, 1, 0, 0, 1 }, { 1, 1, 0, 0, 1 }, { 0, 1, 1, 1, 0 } };
    static int n = 5;
    static int j;
    static boolean visited[] = new boolean[n];
    static int road[] = new int[n];
    public static void main(String[] args) {

        System.out.println("La matriz es: ");
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println("Direccion del grafo");
        System.out.println(" ");
        graph(0, 0);
    }
    public static void graph(int i, int amount) {
        visited[i] = true;
        road[j] = i;
        if (amount < n) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l<n ; l++) {
                    if (matriz[i][j] == 1 && !visited[j]) {
                        visited[j] = true;
                        System.out.println(i);
                        graph(j, amount++);
                    }
                }
            }
        } else {
            System.out.println("No cumple con las caracteristicas");
        }
    }
}
