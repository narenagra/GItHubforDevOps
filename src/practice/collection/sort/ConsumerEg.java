package practice.collection.sort;
import java.util.*;
import java.util.function.Consumer;

public class ConsumerEg {
public static void main(String[] args) {
	System.out.println("With Lamda exp....");
	Consumer<Number> NumberPrint=s->System.out.println(s);
	
	// use consumer to print a number
	System.out.println("Print Number By consumer -----");
	NumberPrint.accept(123);
	
	//Consumer with String type
	Consumer<String > StringPrint=s->System.out.println(s);
    System.out.println("Print String By Consumer");
	StringPrint.accept("Hello World ");
	Consumer<Integer> ConInteger=System.out::println;
	System.out.println("consumer with Method Reference");
	ConInteger.accept(111);
	
	
}
}
