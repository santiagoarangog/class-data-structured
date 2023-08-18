import java.util.Scanner;

public class PedirMano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("👋 Bienvenido al sistema para pedir la mano en matrimonio 👩‍❤️‍👨");
        System.out.println("------------------------------------------------------");

        System.out.println("🪪 Ingresa tu nombre *");
        String name = scanner.next();

        System.out.println("👋 Hola 🪪 "+ name + " A continuación te haremos una serie de preguntas ☑️ para saber si estas o no preparado para pedir la mano en matrimonio");

        System.out.println("💍 Estas casado? * (Si/No)");
        String isMarried = scanner.next();

        if (isMarried.equalsIgnoreCase("Si")){
            System.out.println("🛟 Deseas finalizar tu otro matrimonio? * (Si/No)");
            String isDivorced = scanner.next();

            if(isDivorced.equalsIgnoreCase("Si")){
                System.out.println("📲 Estás listo para pedir la mano en matrimonio.\n ¿Deseas continuar? (✅ Si/No ❌)");
                String isStarted = scanner.next();

                if (isStarted.equalsIgnoreCase("Si")) {
                    System.out.println("🧑‍🦲 Ingresa el nombre de la persona a la que deseas proponer matrimonio:");
                    String nameCouple = scanner.next();

                    System.out.println("📍 Elige un lugar y momento especial para la propuesta:");
                    String location = scanner.next();

                    System.out.println("🥰 Escribe tus sentimientos y motivaciones:");
                    String feelings = scanner.next();

                    System.out.println("✍️ ¿Deseas presentar un anillo de compromiso? (✅ Si/No ❌)");
                    String ring = scanner.next();

                    if (ring.equalsIgnoreCase("Si")) {
                        System.out.println("🧳 Ya adquiriste un anillo de compromiso. (✅ Si/No ❌)");
                        String buyRing = scanner.next();

                        if(buyRing.equalsIgnoreCase("No")){
                            System.out.println("Debes adquirir un anillo para poder continuar");
                        }else {
                            System.out.println("********** 🥰😍 Felicidades " + name + " falta poco para concretar la unión con " +  nameCouple + " 🤩🥳 **********");
                            System.out.println("Aquí te compartimos algunos pasos para concretar tan magnifico evento 🎊🎉🍾");
                            System.out.println(name + " habla con " + nameCouple + " y comparte tus sentimientos : " + feelings);
                            System.out.println("Realiza la propuesta en " + location + ".");
                        }
                    }
                } else{
                    System.out.println("Ya que estas casado no puedes continuar con el proceso hasta que no finalices tu relación actual 💔");
                }
            }
        } else {
            System.out.println("Decidiste no continuar con la propuesta. ¡Quizás en otro momento! ✋😘");
        }
    }
}
