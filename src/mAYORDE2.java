import java.util.Scanner;

public class mAYORDE2 {

    public static void main(String[] args) {
        //DECLARO VARIABLES
        int num=10,mayor =0, medio = 0, menor = 0;
        Scanner numero = new Scanner(System.in);

        //CREO OBJETO SCANNER PARA PEDIR NUMERO POR TECLADO
        System.out.println("Ingresa un numero");
        num= numero.nextInt();
        mayor = num;

        for (int i= 1; i<5; i++)
        {
            System.out.println("Ingresa otro numero");
            num = numero.nextInt();

            if(num>mayor)
            {
                mayor = num;
            }
            if(num<mayor){
                menor = num;
            }
        }

        System.out.println("El numero mayor es: "+ mayor);
        System.out.println("El numero menor es: "+ menor);
        System.out.println("El numero menor es: "+ menor);

    }
}
