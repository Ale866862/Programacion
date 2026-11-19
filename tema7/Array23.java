public class Array23 {
    public static void main(String[] args) {
        //23. Que gestione los datos de stock de una tienda de comestibles, la información a recoger será: nombre del producto, precio, cantidad en stock. La tienda dispone de 10 productos distintos. El programa debe ser capaz de: (Puedes utilizar 3 arrays, para nombre, stock y precio). a. Dar de alta un producto nuevo. b. Buscar un producto por su nombre. c. Modificar el stock y precio de un producto dado.

        String[] nombres = new String[10];
        double[] precios = new double[10];
        int[] stock = new int[10];

        // Inicializar los productos con datos de ejemplo
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "Producto" + (i + 1);
            precios[i] = 10.0 + i; // Precios de ejemplo
            stock[i] = 5 + i; // Stock de ejemplo
        }

        System.out.println("Gestión de stock de la tienda de comestibles");
        System.out.println("1. Dar de alta un producto nuevo");
        System.out.println("2. Buscar un producto por su nombre");
        System.out.println("3. Modificar el stock y precio de un producto dado");
        System.out.print("Seleccione una opción: ");
        int opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 1:
                // Dar de alta un producto nuevo
                System.out.print("Ingrese el nombre del producto: ");
                String nuevoNombre = System.console().readLine();
                System.out.print("Ingrese el precio del producto: ");
                double nuevoPrecio = Double.parseDouble(System.console().readLine());
                System.out.print("Ingrese la cantidad en stock: ");
                int nuevoStock = Integer.parseInt(System.console().readLine());

                boolean agregado = false;
                for (int i = 0; i < nombres.length; i++) {
                    if (nombres[i] == null) {
                        nombres[i] = nuevoNombre;
                        precios[i] = nuevoPrecio;
                        stock[i] = nuevoStock;
                        System.out.println("Producto agregado exitosamente.");
                        agregado = true;
                        break;
                    }
                }
                if (!agregado) {
                    System.out.println("No hay espacio para agregar más productos.");
                }
                break;

            case 2:
                // Buscar un producto por su nombre
                System.out.print("Ingrese el nombre del producto a buscar: ");
                String buscarNombre = System.console().readLine();
                boolean encontrado = false;

                for (int i = 0; i < nombres.length; i++) {
                    if (nombres[i] != null && nombres[i].equalsIgnoreCase(buscarNombre)) {
                        System.out.println("Producto encontrado:");
                        System.out.println("Nombre: " + nombres[i]);
                        System.out.println("Precio: " + precios[i]);
                        System.out.println("Stock: " + stock[i]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
                break;

            case 3:
                // Modificar el stock y precio de un producto dado
                System.out.print("Ingrese el nombre del producto a modificar: ");
                String modificarNombre = System.console().readLine();
                boolean modificado = false;

                for (int i = 0; i < nombres.length; i++) {
                    if (nombres[i] != null && nombres[i].equalsIgnoreCase(modificarNombre)) {
                        System.out.print("Ingrese el nuevo precio: ");
                        precios[i] = Double.parseDouble(System.console().readLine());
                        System.out.print("Ingrese la nueva cantidad en stock: ");
                        stock[i] = Integer.parseInt(System.console().readLine());
                        System.out.println("Producto modificado exitosamente.");
                        modificado = true;
                        break;
                    }
                }
                if (!modificado) {
                    System.out.println("Producto no encontrado.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}
