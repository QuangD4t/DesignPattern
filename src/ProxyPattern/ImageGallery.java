package ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class ImageGallery {
    public static void main(String[] args) {
        List<DisplayObject> slideshow = new ArrayList<>();

        // Khởi tạo các Proxy (Rất nhanh vì chưa load ảnh thực tế)
        slideshow.add(new ImageProxy("vinh_ha_long.jpg"));
        slideshow.add(new ImageProxy("da_lat_suong_mu.jpg"));
        slideshow.add(new ImageProxy("phu_quoc_sunset.png"));

        System.out.println("--- Danh sách slideshow đã sẵn sàng ---");

        // Khi người dùng chuyển slide đến đâu, ảnh mới được load đến đó
        System.out.println("\n[Slide 1]");
        slideshow.get(0).display();

        System.out.println("\n[Slide 2]");
        slideshow.get(1).display();

        // Lần gọi thứ 2 sẽ không phải load lại từ đĩa nữa
        System.out.println("\n[Slide 1 - Xem lại]");
        slideshow.get(0).display();
    }
}
