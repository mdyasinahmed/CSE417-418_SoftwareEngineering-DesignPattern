// Steps -> 1. Interface Create
//          2. Basic Class Making
//          3. Decorator Class Making
//          4. Multiple Usecase/ Scenario - Multiple Class
//          -> Implemnt in Main Class

// 1. Interface Create
interface HallRoom {
    String book();
    double cost();
}

// 2. Basic Class Making
class BasicHall implements HallRoom{
    @Override
    public String book() {
        return "Booked Hall Room.";
    }

    @Override
    public double cost() {
        return 25000;
    }
}

// 3. Decorator Class Making
abstract class HallDecorator implements HallRoom {
    protected HallRoom hallBooking;

    public HallDecorator(HallRoom hallBooking) {
        this.hallBooking = hallBooking;
    }

    @Override
    public String book() {
        return hallBooking.book();
    }

    @Override
    public double cost() {
        return hallBooking.cost();
    }
}

// 4. Multiple Usecase/ Scenario - Multiple Class
class ConferenceBooking extends HallDecorator{
    public ConferenceBooking(HallRoom hallBooking) {
        super(hallBooking);
    } 

    public String book() {
        return super.book() + "Booked for Conference.";
    }

    public double cost() {
        return super.cost() + 5000;
    }

}

class ExamBooking extends HallDecorator{
    public ExamBooking(HallRoom hallBooking) {
        super(hallBooking);
    } 

    public String book() {
        return super.book() + "Booked for Exam.";
    }

    public double cost() {
        return super.cost() + 10000;
    }
}

public class Main {
    public static void main(String[] args) {
        HallRoom basicHall = new BasicHall();

        HallRoom conference = new ConferenceBooking(basicHall);
        System.out.println(conference.book());
        System.out.println("Cost: " + conference.cost());
    }
}