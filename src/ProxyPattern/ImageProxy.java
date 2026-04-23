package ProxyPattern;

public class ImageProxy implements DisplayObject {
    private ImageFile realImage;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Lazy loading: Chỉ khởi tạo khi thực sự cần
        if (realImage == null) {
            realImage = new ImageFile(fileName);
        }
        realImage.display();
    }
}
