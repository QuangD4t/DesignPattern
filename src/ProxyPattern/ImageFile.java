package ProxyPattern;

public class ImageFile implements DisplayObject {
    private String fileName;

    public ImageFile(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // Giả lập việc load tốn thời gian
    }

    private void loadFromDisk() {
        System.out.println("⏳ Đang tải file ảnh từ đĩa: " + fileName + " (Tốn 2s...)");
    }

    @Override
    public void display() {
        System.out.println("🖼️ Hiển thị hình ảnh: " + fileName);
    }
}
