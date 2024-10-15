package Question;

public class ConsoleReset {

    public void resetConsole() {

        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // For Windows, call "cls" command to clear the console
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // ANSI escape code to clear the console on Unix-based systems (Linux, macOS, etc.)
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void wait_a_minute_who_are_you(int duration)
    {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}