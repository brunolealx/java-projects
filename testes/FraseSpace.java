public class FraseSpace{

public static void main(String[] args){

System.out.println(espacejando ("java"));

System.out.println(espacejando ("O método é uma boa prática de programação"));

}

private static String espacejando (String f){

String aux="";

for (byte i=0;i<f.length();i++){

aux=aux+f.charAt(i)+ " ";

}

return aux;

}

}
