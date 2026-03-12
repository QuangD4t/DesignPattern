package SingletonPattern;

public class PrintSpooler {

    // Biến static lưu instance duy nhất
    private static PrintSpooler instance;

    // Constructor private để ngăn tạo object từ bên ngoài
    private PrintSpooler() {
        init();
    }

    // Hàm khởi tạo phức tạp (giả lập)
    private void init() {
        System.out.println("Initializing Print Spooler...");
        // Ví dụ:
        // - Kết nối máy in
        // - Tạo hàng đợi in
        // - Load cấu hình
    }

    // Phương thức cung cấp instance duy nhất
    public static PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    // Ví dụ một chức năng của PrintSpooler
    public void printDocument(String documentName) {
        System.out.println("Printing document: " + documentName);
    }
}