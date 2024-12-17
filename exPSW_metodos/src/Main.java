import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // diseña un programa que valide una contraseña según las seguientes reglas:
        //1. debe tener el menos 8 caracteres.
        //2.debe contener al menos una letra mayuscula,una miniscula, un numero y un caracter especial
        //3.no puede contener espacios.
        // ejemplo: Pa$$w0rd123
        //salida: la cotrasena es valida

        Scanner scanner = new Scanner(System.in);
        char[] caracter ={'@','-','_','&','/','*','%','?','!','$','#'};


        String psw = scanner.next();
        if (psw.length() < 8) {
            System.out.println("al menos 8");
        }
        Boolean todasSonMayusculas = true;
        boolean todasSonMinusculas = true;
        boolean noHayNingunaNumero = true;
        boolean noHayEspacios = true;
        boolean noHayCaracter = true;

        for (int i = 0; i < psw.length(); i++) {
            if (psw.toUpperCase().charAt(i) == psw.charAt(i)) {
                todasSonMinusculas = false;
            } if(psw.toLowerCase().charAt(i)== psw.charAt(i)){
                todasSonMayusculas= false;
            } if (psw.charAt(i) >= '0' && psw.charAt(i) <= '0'+9){ // el code del numero 0 es 48 /-- podemos escribir '9' o '0' +9 es lo mismo
                noHayNingunaNumero= false;
            }

            for (int j = 0; j < caracter.length; j++) {
                if (psw.charAt(i) == caracter[j]){
                    noHayCaracter = false;
                }
            }
        }

        if (psw.contains(" ")) {
            System.out.println("no puede tener espacio");
        }

        if (todasSonMinusculas){
            System.out.println("al menos una mayor");
        } if (todasSonMayusculas){
            System.out.println("al menos una minor");
        }
        if(noHayNingunaNumero){
            System.out.println("al menos un numero");
        }
        if (noHayCaracter){
            System.out.println("al menos un caracter");
        }
        else {
            System.out.println("la contraseña es valida");
        }

    }
}