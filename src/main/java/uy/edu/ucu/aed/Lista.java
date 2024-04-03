package uy.edu.ucu.aed;

public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(T dato, Comparable clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public T buscar(Comparable clave) {
        if (primero == null) {
            return null;
        } else {
            {
                Nodo<T> actual = primero;
                while (actual != null) {
                    if (actual.compareTo(clave) == 0) {
                        return actual.getDato();
                    }
                    actual = actual.getSiguiente();
                }
                return null;
            }
            // throw new UnsupportedOperationException("Unimplemented method 'buscar'");
        }
    }

    @Override
    public boolean eliminar(Comparable clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public String imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public String imprimir(String separador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public int cantElementos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cantElementos'");
    }

    @Override
    public boolean esVacia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esVacia'");
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrimero'");
    }

    // implementar los metodos indicados en la interfaz
}
