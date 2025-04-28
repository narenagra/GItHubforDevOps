package practice.collection.sort;
import java.lang.foreign.Linker.Option;
import java.util.*;
public class FunctionEg {
public static void main(String[] args) {
	String s1="Java is Awesome ";
	Optional<String> op1=Optional.ofNullable(s1);
	Optional<String>op2=op1.map(n->new StringBuilder(n).reverse().toString());
	System.out.println(op2);
   System.out.println("-------Map------------");
   Optional<Optional<String>> op3=Optional.of(Optional.ofNullable(s1));
   System.out.println(op3);
	Optional<Optional<String>> op4=op3.map(n->n.map(n2->n2.toUpperCase()));
	System.out.println(op4);
   System.out.println("-------FlatMap-----------------");
   
   
   
   
   
   
}
}
