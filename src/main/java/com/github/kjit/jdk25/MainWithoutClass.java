void main() {
    var name = IO.readln("Give me your name:");
    IO.println("Hello %s from main method: %s".formatted(name, this.getClass().getName()));
}