
import java.util.*;
import java.util.Scanner;
import javax.naming.ldap.HasControls;

public class aceptaelreto700 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm;
        ArrayList<Serie> al;
        String[] datos;
        while (true) {
            hm = new HashMap<>();
            al = new ArrayList<>();
            int casos = sc.nextInt();
            sc.nextLine();
            if (casos == 0) {
                break;
            }
            for (int i = 0; i < casos; i++) {
                datos = sc.nextLine().split(" ", 2);
                int minutos = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                if (!hm.containsKey(nombre)) {
                    hm.put(nombre, minutos);
                } else if (hm.containsKey(nombre)) {
                    hm.put(nombre, hm.get(nombre) + minutos);
                }

            }

            for (Map.Entry<String, Integer> entry : hm.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();

                Serie s = new Serie(value, key);
                if (value > 29) {
                    al.add(s);
                }

            }

            Collections.sort(al);
            int l = Math.min(3, al.size());
            for (int i = 0; i < l; i++) {
                System.out.println(al.get(i).nombre);
            }
            System.out.println("---");

        }
    }

    public static class Serie implements Comparable {

        int minutos;
        String nombre;

        public Serie(int minutos, String nombre) {
            this.minutos = minutos;
            this.nombre = nombre;
        }

        public int getMinutos() {
            return minutos;
        }

        public void setMinutos(int minutos) {
            this.minutos = minutos;
        }

        @Override
        public int compareTo(Object o) {
            Serie serie = (Serie) o;
            if (serie.minutos != this.minutos) {
                return Integer.compare(serie.minutos, this.minutos);
            } else {
                return this.nombre.compareTo(serie.nombre);
            }

        }

        @Override
        public String toString() {
            return "Serie{" + "nombre=" + nombre + '}';
        }

    }
}
