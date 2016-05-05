package d.defaultt.methods.foreach.java8;

import java.util.function.Consumer;

public class ConsumidorDeStrings implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}
