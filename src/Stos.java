import java.util.EmptyStackException;
import java.util.LinkedList;


public class Stos<T> {
    private LinkedList<T> stos=new LinkedList<T>();
    void dodaj(T number){
        stos.add(number);
    }
    T usun()throws EmptyStackException {
        if(stos.isEmpty()){
            throw new EmptyStackException();
        }else {
            return stos.pollLast();
        }
    }

    int size(){
        return stos.size();
    }


    T podgladanie()throws EmptyStackException {
        if (stos.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stos.peekLast();
        }
    }


    @Override
    public String toString() {
        return "Stos{" +
                "stos=" + stos +
                '}';
    }

    public LinkedList<T> getStos() {
        return stos;
    }

    public void setStos(LinkedList<T> stos) {
        this.stos = stos;
    }
}