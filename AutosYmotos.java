    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
    public class AutosYmotos {
        private static List<Vehiculos> listaVehiculos = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            menu();
        }

        private static void crearAuto() {
            System.out.print("Ingrese la marca del auto: ");
            String marcaAuto = scanner.nextLine();
            System.out.print("Ingrese el modelo del auto: ");
            String modeloAuto = scanner.nextLine();
            listaVehiculos.add(new Vehiculos(marcaAuto, modeloAuto));
            System.out.println("Auto creado exitosamente.");
        }

        private static void crearMotocicleta() {
            System.out.print("Ingrese la marca de la moto: ");
            String marcaMoto = scanner.nextLine();
            System.out.print("Ingrese el modelo de la moto: ");
            String modeloMoto = scanner.nextLine();
            listaVehiculos.add(new Vehiculos(marcaMoto, modeloMoto));
            System.out.println("Moto creada exitosamente.");
        }

        private static void verVehiculos() {
            System.out.println("Lista de vehículos:");
            for (Vehiculos vehiculo : listaVehiculos) {
                System.out.println("Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo());
            }
        }

        private static void salir() {
            System.out.println("Saliendo del programa.");
            scanner.close();
            System.exit(0);
        }

        public static void menu() {
            while (true) {
                System.out.println("Menú:");
                System.out.println("1. Crear auto");
                System.out.println("2. Crear moto");
                System.out.println("3. Ver vehículos");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        crearAuto();
                        break;
                    case 2:
                        crearMotocicleta();
                        break;
                    case 3:
                        verVehiculos();
                        break;
                    case 4:
                        salir();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        }

    }