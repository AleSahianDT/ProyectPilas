import java.util.Stack;

public class Pila {
    private Stack <Integer> numeros;

    public Pila() {
        numeros = new Stack<Integer>();
    }

    public boolean estaVaacia(){
        return numeros.empty();
    }

    public void apilar(Integer elemento){
        numeros.push(elemento);
    }

    public Integer desapilar() throws Exception {
        if (estaVaacia())
            throw new Exception("No hay elementos");
        return numeros.pop();
        //POP PARA SACAR ELEMENTOS
    }

    public Integer cima() throws Exception{
        if (estaVaacia())
            throw new Exception("No hay elementos");
        return numeros.peek();
    }

    public int buscarElemento(int i) throws Exception{
        if (estaVaacia())
            throw new Exception("No hay elementos");
        return numeros.search(i);
    }

    public String convertirBinario(){
        double[] binario = {1000};
        int exp = 0;
        double decimal = 0;

        for(int i = 0; i < binario.length; i++) {
            for(exp = 0; exp < 4; exp++) {
                decimal = binario[i] * (int)Math.pow(2, exp);
            }
        }
        return String.valueOf(binario);
    }

    @Override
    public String toString(){
        String mensaje = "";
        for (int i=numeros.size()-1; i>= 0; i--){
            mensaje += numeros.get(i)+ "\n";
        }
        return mensaje;
    }
}
