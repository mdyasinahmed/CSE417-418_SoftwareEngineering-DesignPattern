package Lab_08.decorator;

// Component Interface
interface HallBooking {
    String getDescription();
    double getCost();
}

// Concrete Component
class BasicHallBooking implements HallBooking {
    @Override
    public String getDescription() {
        return "Basic Hall";
    }

    @Override
    public double getCost() {
        return 50000; // Base cost
    }
}

// Abstract Decorator
abstract class HallDecorator implements HallBooking {
    protected HallBooking hallBooking;

    public HallDecorator(HallBooking hallBooking) {
        this.hallBooking = hallBooking;
    }

    @Override
    public String getDescription() {
        return hallBooking.getDescription();
    }

    @Override
    public double getCost() {
        return hallBooking.getCost();
    }
}

// Event Decorators
class WeddingDecorator extends HallDecorator {
    public WeddingDecorator(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Wedding Setup";
    }

    @Override
    public double getCost() {
        return super.getCost() + 120000;
    }
}

class BirthdayPartyDecorator extends HallDecorator {
    public BirthdayPartyDecorator(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Birthday Party Setup";
    }

    @Override
    public double getCost() {
        return super.getCost() + 30000;
    }
}

class IELTSExamDecorator extends HallDecorator {
    public IELTSExamDecorator(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", IELTS Exam Setup";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50000;
    }
}

class TechWorkshopDecorator extends HallDecorator {
    public TechWorkshopDecorator(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tech Workshop Setup";
    }

    @Override
    public double getCost() {
        return super.getCost() + 25000;
    }
}

// Additional Service Decorators
class CateringServiceDecorator extends HallDecorator {
    public CateringServiceDecorator(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Catering Service";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20000;
    }
}

class AudioVisualDecorator extends HallDecorator {
    public AudioVisualDecorator(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Audio-Visual Setup";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15000;
    }
}

class ExtraSeatingDecorator extends HallDecorator {
    public ExtraSeatingDecorator(HallBooking hallBooking) {
        super(hallBooking);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Extra Seating";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10000;
    }
}

public class Main {
    public static void main(String[] args) {
        HallBooking hall = new BasicHallBooking();

        // Booking a Wedding with Catering and Audio-Visual Setup
        HallBooking weddingBooking = new CateringServiceDecorator(new AudioVisualDecorator(new WeddingDecorator(hall)));
        System.out.println("Booking Details: " + weddingBooking.getDescription());
        System.out.println("Total Cost: BDT " + weddingBooking.getCost() + "\n");

        // Booking an IELTS Exam with Extra Seating
        HallBooking ieltsBooking = new ExtraSeatingDecorator(new IELTSExamDecorator(hall));
        System.out.println("Booking Details: " + ieltsBooking.getDescription());
        System.out.println("Total Cost: BDT " + ieltsBooking.getCost() + "\n");
    }
}
