package StreamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapStream {
public static void main(String[] args) {
	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(1,"a");
	map.put(2,"b");
	map.put(3,"c");
	map.put(4,"d");
	map.put(5,"e");
	
	System.out.println("Map "+ map);
	Stream<Entry<Integer, String>> stream = map.entrySet().stream();
	System.out.println("Stream (Map to Stream )= "+Arrays.toString(stream.toArray()));
}
	
}
