class GenericsDemo<T> {
    T[] predator;

    GenericsDemo(T[] predator) {
        this.predator = predator;
    }

    void createArray() {
        for (int i = 0; i < predator.length; i++) {
            System.out.print(predator[i] + "");
            if(i!=predator.length-1){
                System.out.print(",");
            }
        }
    }
} 

public class Generics {
    public static void main(String[] args) {
        GenericsDemo<Integer> gd = new GenericsDemo<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        gd.createArray();
        GenericsDemo<String> gd1=new GenericsDemo<String>(new String[]{"Welcome","To","Java","Generics"});
        gd1.createArray();
    }
}