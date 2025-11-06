import com.github.kjit.jdk25.ConsoleReader;

void main() {
    var name = IO.readln("Give me your name, please : ");
    IO.println("Hello %s from main method: %s".formatted(name, this.getClass().getName()));

    ConsoleReader reader = new ConsoleReader();
    var __ = reader.read(2);
    IO.println("Output is: " + __);
}