

import org.apache.log4j.Logger;

public class HelloWorldLog4j {
	
	//Constante do Log4j; para visualizar o erro.
	
	final static Logger logger = Logger.getLogger(HelloWorldLog4j.class);
	
	public static void main(String []args) {
		
		HelloWorldLog4j hello = new HelloWorldLog4j();
		try {
		hello.dividir();
		}catch(ArithmeticException ex) {
			logger.error("Desculpe mas nao foi possivel dividir este valor", ex);
		}
		
	}
	private void dividir() {
		int i = 20/0;// Para gerar um erro pelo Log4f
		System.out.println("Soma!");
	}

}
