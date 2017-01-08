package mx.com.sidlors.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import mx.com.sidlors.services.OutputHelper;

public class AppOutputGenerator {

    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
	OutputHelper outputSeteado = (OutputHelper) context.getBean("OutputHelperSeteado");
	OutputHelper outputTxt = (OutputHelper) context.getBean("OutputHelperSeteadoTxt");
	output.generateOutput();
	outputSeteado.generateOutput();
	outputTxt.generateOutput();
    }

}
