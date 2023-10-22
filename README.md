# Stream_Map_grouping
<h3>
  The groupingBy()
  method of Collectors class in Java are used for grouping objects by some property and storing results in a Map instance. In order to use it, we always need to specify a property by which the grouping would be performed. This method provides similar functionality to SQL’s GROUP BY clause.
 

Syntax:  

public static Collector<T, ?, Map<K, List>> groupingBy(Function classifier) 
 

Type Parameter: This method takes two type parameters: 

T- It is the type of the input elements.
 
K- It is the type the input elements to be converted.
Parameters: This method accepts two mandatory parameters:  

Function- It is the property which is to be applied to the input elements.
 
Classifier- It is used to map input elements into the destination map.
Return value: It returns a collector as a map.</h3>
