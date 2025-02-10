package Lab_03.DesignPatternPractice.builder_method.ComputerConfiguration;

final class Order {
    private String Processor;
    private String Storage;
    private String Graphics_card;

    // Order(String Processor, String Storage, String Graphics_card){
    //     Processor = this.Processor;
    //     Storage = this.Storage;
    //     Graphics_card = this.Graphics_card;
    // }

    public Order setProcessor(String Processor) {
        this.Processor = Processor;
        return this;
    }

    public Order setStorage(String Storage) {
        this.Storage = Storage;
        return this;
    }

    public Order setGraphics_card(String Graphics_card) {
        this.Graphics_card = Graphics_card;
        return this;
    }

    @Override
    public String toString() {
        return "Processor = " + this.Processor + "\nStorage = " + this.Storage + "\nGraphics Card = " + this.Graphics_card + "\n";
    }


}
