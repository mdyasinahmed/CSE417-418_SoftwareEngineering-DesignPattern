package Lab_08;

// Hall Room Booking System using Decorator Pattern

// Step 1: Component Interface
interface HallBooking {
    String book();
    double cost();
}

// Step 2: Concrete Component (Basic Hall)
class BasicHall implements HallBooking {
    @Override
    public String book() {
        return "Basic Hall Booked";
    }

    @Override
    public double cost() {
        return 5000; // Base cost
    }
}

// Step 3: Abstract Decorator
abstract class HallDecorator implements HallBooking {
    protected HallBooking hallBooking;

    public HallDecorator(HallBooking hallBooking) {
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

// Step 4: Concrete Decorators

// Conference Hall
class ConferenceHall extends HallDecorator {
    public ConferenceHall(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String book() {
        return super.book() + " with Conference Setup (Sound System + Projector)";
    }

    @Override
    public double cost() {
        return super.cost() + 2000;
    }
}

// Wedding Hall
class WeddingHall extends HallDecorator {
    public WeddingHall(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String book() {
        return super.book() + " with Wedding Decoration & Catering";
    }

    @Override
    public double cost() {
        return super.cost() + 8000;
    }
}

// Party Hall
class PartyHall extends HallDecorator {
    public PartyHall(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String book() {
        return super.book() + " with Party Setup (DJ + Lighting)";
    }

    @Override
    public double cost() {
        return super.cost() + 5000;
    }
}

// Workshop Hall
class WorkshopHall extends HallDecorator {
    public WorkshopHall(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String book() {
        return super.book() + " with Workshop Setup (Whiteboards + High-Speed Internet)";
    }

    @Override
    public double cost() {
        return super.cost() + 3000;
    }
}

// Step 5: Main Application
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        HallBooking basicHall = new BasicHall();

        // Booking a Conference Hall
        HallBooking conferenceHall = new ConferenceHall(basicHall);
        System.out.println(conferenceHall.book());
        System.out.println("Total Cost: $" + conferenceHall.cost());

        // Booking a Wedding Hall
        HallBooking weddingHall = new WeddingHall(basicHall);
        System.out.println("\n" + weddingHall.book());
        System.out.println("Total Cost: $" + weddingHall.cost());

        // Booking a Party Hall
        HallBooking partyHall = new PartyHall(basicHall);
        System.out.println("\n" + partyHall.book());
        System.out.println("Total Cost: $" + partyHall.cost());

        // Booking a Workshop Hall
        HallBooking workshopHall = new WorkshopHall(basicHall);
        System.out.println("\n" + workshopHall.book());
        System.out.println("Total Cost: $" + workshopHall.cost());

        // Booking a Wedding + Party Combo Hall
        HallBooking weddingPartyHall = new PartyHall(new WeddingHall(basicHall));
        System.out.println("\n" + weddingPartyHall.book());
        System.out.println("Total Cost: $" + weddingPartyHall.cost());
    }
}

