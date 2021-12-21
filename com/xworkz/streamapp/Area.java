package com.xworkz.streamapp;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Area {
	public static void main(String args[]) {
System.out.println("Area in Ascending order and lowercase");
Stream<String>areaStream=
Stream.of("Banashankari","Shivajinagar","Rajajinagar","RajaRajeshwarinagar","Kalasipalya","Majestic","BTM Layout","HSR Layout","Nelamangala","Koramangala","Shreerampura","Gayatrinagar","Prakashnagar","Basavanagudi");
List<String> area=
areaStream.map(String::toLowerCase).sorted().collect(Collectors.toList());
area.forEach((a)->System.out.println(a));

System.out.println("......................");

System.out.println("Area in Descending order and uppercase");
Stream<String>areaStream1=
Stream.of("Banashankari","Shivajinagar","Rajajinagar","RajaRajeshwarinagar","Kalasipalya","Majestic","BTM Layout","HSR Layout","Nelamangala","Koramangala","Shreerampura","Gayatrinagar","Prakashnagar","Basavanagudi");
List<String> area1=
areaStream.map(String::toUpperCase).sorted(Collections.reverseOrder())
.collect(Collectors.toList());
area1.forEach((a)->System.out.println(a));

}
}