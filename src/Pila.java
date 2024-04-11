import java.util.Stack;

public class Pila {
    private Stack <Integer> numeros;

    public Pila() {
        numeros = new Stack<Integer>();
    }

    public boolean estaVacia(){
        return numeros.empty();
    }

    public void apilar(Integer elemento){
        numeros.push(elemento);
    }

    public Integer desapilar() throws Exception {
        if (estaVacia())
            throw new Exception("No hay elementos");
        return numeros.pop();
        //POP PARA SACAR ELEMENTOS
    }

    public Integer cima() throws Exception{
        if (estaVacia())
            throw new Exception("No hay elementos");
        return numeros.peek();
    }

    public int buscarElemento(int i) throws Exception{
        if (estaVacia())
            throw new Exception("No hay elementos");
        return numeros.search(i);
    }

    public String convertirBinario(int numeroDecimal) {
        if (numeroDecimal == 0) return "0";

        StringBuilder binario = new StringBuilder();
        while (numeroDecimal > 0) {
            binario.insert(0, numeroDecimal % 2);
            numeroDecimal /= 2;
        }
        return binario.toString();
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
