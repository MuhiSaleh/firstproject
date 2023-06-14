package TEST2;

public class Main {
    public static void main(String[] args) {
       ContainerBox<makemöbel> box = new ContainerBox<>();
       
       makemöbel möbel1 = new makemöbel();
       möbel1.SetName("couch");
       möbel1.SetColor("grau");
       möbel1.setGroße(250);

       makemöbel möbel2 = new makemöbel(41,"VANS","black");

       box.add(möbel2);
       box.add(möbel1);
    
       box.printList();
    }
}
