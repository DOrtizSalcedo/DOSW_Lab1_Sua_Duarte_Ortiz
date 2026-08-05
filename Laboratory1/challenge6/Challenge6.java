import java.util.HashMap;
import java.util.Map;

public class Challenge6 {

    private Map<String, Runnable> commands = new HashMap<>();

    public Challenge6() {
       
        commands.put("GREET", () -> System.out.println("Greetings, traveler of time and code!"));
        commands.put("FAREWELL", () -> System.out.println("May the bits be with you until the next mission."));
        commands.put("SING", () -> System.out.println("01010101"));
        commands.put("DANCE", () -> System.out.println("Spinning in party mode."));     
        commands.put("JOKE", () -> System.out.println("Why did RAM break up with CPU? It needed space."));
        commands.put("SHOUT", () -> System.out.println("STACK OVERFLOW ALERT!"));
        commands.put("WHISPER", () -> System.out.println("Shhh... the bugs are sleeping."));
        commands.put("ANALYZE", () -> System.out.println("Processing data... result: You're amazing at coding!"));
    }

    public void executeCommand(String command) {
        switch (command) {
            case "GREET":
            case "FAREWELL":
            case "SING":
            case "DANCE":
            case "JOKE":
            case "SHOUT":
            case "WHISPER":
            case "ANALYZE":
                commands.get(command).run();
                break;
            default:
                System.out.println("Unknown command.");
        }
    }

    public static void main(String[] args) {
        Challenge6 machine = new Challenge6();

        machine.executeCommand("GREET");
        machine.executeCommand("FAREWELL");
        machine.executeCommand("SING");
        machine.executeCommand("DANCE");
        machine.executeCommand("JOKE");
        machine.executeCommand("SHOUT");
        machine.executeCommand("WHISPER");
        machine.executeCommand("ANALYZE");
    }
}