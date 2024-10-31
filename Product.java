class Product implements ProductOperations, ProducerOperations {
    private String name;
    private String producer;
    private String serialNumber;
    private String type;

    public Product(String name, String producer, String serialNumber, String type) {
        this.name = name;
        this.producer = producer;
        this.serialNumber = serialNumber;
        this.type = type;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Name: " + name + " Producer: " + producer + " Type: " + type + " Serial Number: " + serialNumber);
    }

    @Override
    public boolean checkNameMatch(String name) {
        return this.name.equalsIgnoreCase(name);
    }

    @Override
    public void updateType(String newType) {
        this.type = newType;
    }

    @Override
    public void updateProducer(String newProducer) {
        this.producer = newProducer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
