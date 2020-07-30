import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numCasos= entrada.nextInt();

        int cont=1;
        while(cont<=numCasos) {

            String cadena=entrada.nextLine();
            if (cadena.isEmpty() == true)
            {
                continue;
            }
            if (cont > 0)
            {
                System.out.println();
            }
            int tamanno=cadena.length();
            for (int periodo = 1; periodo < tamanno; periodo++)
            {
                if ((tamanno % periodo) != 0)
                {
                    continue;
                }
                int valor = tamanno / periodo;
                String subCadena = cadena.substring(0, periodo);
                String nCadena = "";
                for (int k = 0; k < valor; k++)
                {
                    nCadena += subCadena;
                }
                if (nCadena.equals(cadena) == true)
                {
                    System.out.println(periodo);

                }
                else
                    {
                        System.out.println(cadena.length());
                        break;
                    }


            }
            cont++;
        }

    }
}
