package FacadePattern;

public class Main {
    public static void main(String[] args) {
        // Thay vì phải gọi 3 object khác nhau, ta chỉ gọi qua Facade
        VacationFacade vacationAgent = new VacationFacade();

        // Khách hàng chỉ cần đưa thông tin, mọi việc phức tạp Facade lo
        vacationAgent.bookFullVacation("Tokyo", "Aman Resort", "Toyota Supra");
    }
}
