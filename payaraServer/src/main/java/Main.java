import fish.payara.micro.PayaraMicroRuntime;

import java.io.IOException;
import java.io.InputStream;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;

public class Main {

    public static void main(String[] args) throws BootstrapException, IOException {
        ClassLoader classLoader = Main.class.getClassLoader();
        PayaraMicroRuntime payaraMicroRuntime = PayaraMicro.getInstance().bootStrap();
        try (InputStream is = classLoader.getResource("app.war").openStream()) {
            payaraMicroRuntime.deploy("", is);
        }
    }

}
