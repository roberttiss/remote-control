import model.AirConditioning;
import model.AirConditioningControl;
import model.Lamp;
import model.LampControl;

public class Client {
    public static void main(String[] args) {
        Lamp lampada;
        lampada = new Lamp("Multilaser");

        LampControl controleLampada = new LampControl(lampada);

        System.out.println(lampada);

        controleLampada.changeColor();

        System.out.println(lampada);

        controleLampada.changeIntensity(90);

        System.out.println(lampada);

        controleLampada.on();

        controleLampada.changeColor();

        System.out.println(lampada);

        controleLampada.changeColor();

        System.out.println(lampada);

        controleLampada.changeColor();

        System.out.println(lampada);

        controleLampada.changeColor();

        System.out.println(lampada);

        controleLampada.changeColor();

        System.out.println(lampada);

        AirConditioning arCondicionado;
        arCondicionado = new AirConditioning("Samsung", 220);

        AirConditioningControl arCondicionadoControle;
        arCondicionadoControle = new AirConditioningControl(arCondicionado);

        System.out.println(arCondicionado);

        arCondicionadoControle.increase_temperature();

        System.out.println(arCondicionado);

        arCondicionadoControle.decrease_temperature();

        System.out.println(arCondicionado);

        arCondicionadoControle.on();

        arCondicionadoControle.increase_temperature();

        System.out.println(arCondicionado);

        arCondicionadoControle.off();

        controleLampada.off();
    }
}