import java.util.Scanner;

public class App {

    public static String[] model = new String[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // testInput();
        viewTodo();
    }

    /**
     * Menampilkan Todo List
     */
    public static void showTodo() {
        System.out.println("=== ->> TODOLIST <<- ===");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    // testing
    public static void testShowTodo() {
        model[0] = "Belajar todo list";
        model[1] = null;
        model[2] = "belajar";
        showTodo();
    }

    /**
     * Menambah Todo List
     */
    public static void addTodo(String todo) {
        // cek apakah model sudah penuh
        var penuh = true;
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                // masih ada yang kosong
                penuh = false;
                break;
            }
        }

        // jika array penuh, resize arraynya
        var temp = model;
        model = new String[model.length * 2];
        for (var i = 0; i < temp.length; i++) {
            model[i] = temp[i];
        }

        // tambahkan ke posisi ke data yang arraynya null
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    // test addTodo
    public static void testAddTodo() {
        for (var i = 0; i < 20; i++) {
            addTodo("Boba " + i);
        }
        showTodo();
    }

    /**
     * Menghapus Todo List
     */
    public static boolean delTodo(Integer number) {
        // kalau inputan lebih besar dari panjang array
        if ((number - 1) >= model.length) {
            return false;

            // jika inputan sudah kosong
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (var i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    // test delete data
    public static void testDelTodo() {
        addTodo("satu");
        addTodo("dua");
        addTodo("tiga");
        addTodo("empat");
        addTodo("lima");

        var res = delTodo(1);
        System.out.println(res);

        res = delTodo(4);
        System.out.println(res);

        res = delTodo(5);
        System.out.println(res);
        showTodo();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var job = input("job");
        System.out.println("Wow! " + job + ", that's cool");
    }

    /**
     * menampilkan view Todo List
     */
    public static void viewTodo() {
        while (true) {
            showTodo();

            System.out.println("=== Menu Pilihan ===");
            System.out.println("1 untuk tambah");
            System.out.println("2 untuk hapus");
            System.out.println("x untuk keluar");

            var input = input("Pilih");
            if (input.equals("1")) {
                viewAddTodo();
            } else if (input.equals("2")) {
                viewDelTodo();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("inputan tidak dimengerti");
            }
        }
    }

    /**
     * Menampilkan view tambah Todo List
     */
    public static void viewAddTodo() {
        System.out.println("TAMBAH TODOLIST");
        var add = input("todo (x jika batal)");
        if (add.equals("x")) {
            // batal
        } else {
            addTodo(add);
        }
    }

    /**
     * menampilkan view hapus Todo List
     */
    public static void viewDelTodo() {
        System.out.println("MENGHAPUS TODOLIST");
        var rem = input("nomor yang dihapus (x jika batal)");
        if (rem.equals("x")) {
            // batal
        } else {
            int s = Integer.parseInt(rem);
            boolean success = delTodo(s);
            if (!success) {
                System.out.println("Gagal menghapus todolist " + rem);
            }
        }
    }
}
