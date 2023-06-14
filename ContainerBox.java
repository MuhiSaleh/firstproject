package TEST2;

import java.util.ArrayList;
import java.util.List;

public class ContainerBox<T extends makemöbel> {

    private List<T> list = new ArrayList<>();

    public void add(T object) {
        this.list.add(object);
    }

    public T get() {
        return this.list.get(0);
    }

    public T getindex(int i) {
        return list.get(i);
    }

    public List<T> getliste() {
        return this.list;
    }

    public int sizeOfList() {
        return this.list.size();
    }

    public void printList() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append("the "+i+"te object is: \n");
            sb.append(list.get(i).getName());
            sb.append(" has the color: "+list.get(i).getColor());
            sb.append(" and the große is: "+list.get(i).getGroße());
            sb.append("\n");
        }

        System.out.println(sb);

    }


}
