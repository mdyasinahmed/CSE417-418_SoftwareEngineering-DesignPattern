package Lab_08.decorator;

interface AmanUllahConvensionHall {
    String book();
    double cost();
}

// Concrete Component
class BasicHall implements AmanUllahConvensionHall {
    @Override
    public String book() {
        return "Booked Aman Ullah for ";
    }

    @Override
    public double cost() {
        return 50000; // Base cost
    }
}

// Abstract Decorator
abstract class HallDecorator implements AmanUllahConvensionHall {
    protected AmanUllahConvensionHall hallBooking;

    public HallDecorator(AmanUllahConvensionHall hallBooking) {
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

class Wedding extends HallDecorator {
    public Wedding(AmanUllahConvensionHall hallBooking) {
        super(hallBooking);
    }

    @Override
    public String book() {
        return super.book() + "Wedding.\nExtra: Sound System, Heavy Meal";
    }

    @Override
    public double cost() {
        return super.cost() + 120000;
    }
}

class BirthdayParty extends HallDecorator {
    public BirthdayParty(AmanUllahConvensionHall hallBooking) {
        super(hallBooking);
    }

    @Override
    public String book() {
        return super.book() + "Birthday Party\nExtra: Light Dinner";
    }

    @Override
    public double cost() {
        return super.cost() + 30000;
    }
}

class IELTS_Exam extends HallDecorator {
    public IELTS_Exam(AmanUllahConvensionHall hallBooking) {
        super(hallBooking);
    }

    @Override
    public String book() {
        return super.book() + "IELTS Exam\nExtra: Exam Setup Decoration";
    }

    @Override
    public double cost() {
        return super.cost() + 50000;
    }
}

class TechWorkshop extends HallDecorator {
    public TechWorkshop(AmanUllahConvensionHall hallBooking) {
        super(hallBooking);
    }

    @Override
    public String book() {
        return super.book() + "Tech Workshop\nExtra: Projector, Loud Speaker, Whiteboard";
    }

    @Override
    public double cost() {
        return super.cost() + 25000;
    }
}

public class Main {
    public static void main(String[] args) {
        AmanUllahConvensionHall basicHall = new BasicHall();

        // Booking a Wedding Hall
        AmanUllahConvensionHall wedding = new Wedding(basicHall);
        System.out.println(wedding.book());
        System.out.println("Total Cost: $" + wedding.cost() + "\n");

        // Booking a Birthday Party Hall
        AmanUllahConvensionHall birthday_party = new BirthdayParty(basicHall);
        System.out.println(birthday_party.book());
        System.out.println("Total Cost: $" + birthday_party.cost() + "\n");

        // Booking a Birthday Party Hall
        AmanUllahConvensionHall ielts_exam = new IELTS_Exam(basicHall);
        System.out.println(ielts_exam.book());
        System.out.println("Total Cost: $" + ielts_exam.cost() + "\n");

        // Booking a Birthday Party Hall
        AmanUllahConvensionHall tech_workshop = new TechWorkshop(basicHall);
        System.out.println(tech_workshop.book());
        System.out.println("Total Cost: $" + tech_workshop.cost() + "\n");
    }
}
