package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcaseで実行結果Snakecamelが取得できる(){
		SnakeCamelUtil SCU = new SnakeCamelUtil();
		String expected = "Snake";
		String actual = SCU.snakeToCamelcase("snake_case");
		assertThat(actual, is(expected));
	}

	@Test
	public void camelToSnakecaseで実行結果camelcaseが取得できる(){
		SnakeCamelUtil SCU = new SnakeCamelUtil();
		String expected = "camelcase";
		String actual = SCU.camelToSnakecase("camelcase");
		assertThat(actual, is(expected));
	}
}
