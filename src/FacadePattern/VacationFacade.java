package FacadePattern;

public class VacationFacade {
    private FlightArrangement flight;
    private HotelBooking hotel;
    private CarRental car;

    public VacationFacade() {
        this.flight = new FlightArrangement();
        this.hotel = new HotelBooking();
        this.car = new CarRental();
    }

    // Phương thức gộp tất cả các bước phức tạp
    public void bookFullVacation(String destination, String hotelName, String carModel) {
        System.out.println("--- Bắt đầu quy trình đặt kỳ nghỉ trọn gói ---");

        flight.bookFlight(destination);
        hotel.bookRoom(hotelName);
        car.bookCar(carModel);

        System.out.println("--- Hoàn tất! Chúc bạn có một chuyến đi vui vẻ ---");
    }
}
