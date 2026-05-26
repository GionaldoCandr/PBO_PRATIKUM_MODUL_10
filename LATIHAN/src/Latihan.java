import java.util.ArrayList;
import java.util.List;


public class Latihan{
    public static void main(String[] args) {
        List<String> nama = new ArrayList<>();
        
        
        
        nama.add("Gio");
        nama.add("Dio");
        nama.add("Rio");


     System.out.println(nama.get(0));
     System.out.println(nama.get(2));


     nama.set(2, "Rico");
     System.out.println(nama.get(2));

     nama.remove(1);

     nama.remove("Gio");



     System.out.println(nama.get(0));
    
     System.out.println(nama.get(1));

        
        
        
        
        
        
        
        
    }
}