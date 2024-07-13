package estaticos;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        Person.contador = 0;
        System.out.println(Person.contador);

        Person person = new Person();
        person.contador = 1;
        System.out.println("++++++++++++++");
        System.out.println(person.contador);
        System.out.println(Person.contador);


        int respuesta1 = Calculadora.suma(3,4);
        int respuesta2 = Calculadora.resta(5,31);

    }
}
