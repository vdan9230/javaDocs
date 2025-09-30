
/* Primer Ejemplo Hola Java - aprenderaprogramar.com */
import java.util.ArrayList;
import java.util.List;

public class justificationText {
      public static void main(String[] arg) {
            /*Char [][] digits = {
                {'a', 'b', 'c', ''},//2
                {'d', 'e', 'f', ''},//3
                {'g', 'h', 'i', ''},//4
                {'j', 'k', 'l', ''},//5
                {'m', 'n', 'o', ''},//6
                {'p', 'q', 'r', 's'},//7
                {'t', 'u', 'v', ''},//8
                {'w', 'x', 'y', 'z'}//9
            };
            List<String> rest = new ArrayList<String>();
            String aux = "";

            String cad = "374";*/

            ArrayList<ArrayList<String>> parrafo = new ArrayList<>();
            String [] words = {"What","must","be","acknowledgment","shall","be"};// {"this", "is", "an", "example", "for", "text", "justificacion"};
            ArrayList<String> reng = new ArrayList<>();
            ArrayList<Integer> nLetras = new ArrayList<>();

            int n = 16;
            int cont = 0;
            int auxC = 0;

            //System.out.println("tamaño digitos: " + j);

            for(int i=0; i < words.length; i++ ){
                  if(cont == 0){
                        cont = cont + words[i].length() + 1;
                        reng.add(words[i]);
                  }else{
                        cont = cont + words[i].length();
                        if(cont <= n){
                              reng.add(words[i]);
                              cont++;
                        }else{
                              parrafo.add(reng);
                              reng = new ArrayList<>();
                              reng.add(words[i]);
                              cont--;
                              nLetras.add(cont - words[i].length());
                              cont = words[i].length() + 1;
                        }
                  }
                  System.out.println("i: " + i);
                  if(i == (words.length - 1)){
                        cont--;
                        parrafo.add(reng);
                        nLetras.add(cont);
                  }
                  System.out.println("nLetras: " + nLetras);
                  System.out.println("cont: " + cont);
                  System.out.println("reng: " + reng);
            }
            System.out.println(parrafo);
            System.out.println("num: " + parrafo.get(0));

            int num = 0;
            int espacios = 0;

            for(int i=0; i<parrafo.size(); i++){
                  String resultado = "";
                  espacios = (parrafo.get(i).size() - 1);
                  num = nLetras.get(i) - espacios;
                  int extra = (n-num)%espacios;
                  int nEspacios = (n-num)/espacios;                 
                  for(int j=0; j<parrafo.get(i).size(); j ++){
                        resultado = resultado + parrafo.get(i).get(j);
                        for(int k=0; k<nEspacios; k++){
                              resultado = resultado + "_";
                              /*if(extra > 0 && j == 0){
                                    resultado = resultado + "_";
                              }*/ //no va aca
                        }
                  }
                  System.out.println("extra: " + extra);
                  System.out.println("num: " + num);
            }

      }
}