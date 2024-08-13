package All;

public  class Gen2 {
    public static void main(String[] args) {
        Gen gen = new Gen();
        Integer[] roll = {12, 33, 44};
        Character[] section = { 'A', 'B', 'C'};
        gen.printElement(roll);
        gen.printElement(section);
    }
}
 class Gen {
    public  <E>void printElement(E[] elements){
        for (E element: elements){
            System.out.println(element);
        }
        System.out.println();
    }
}
