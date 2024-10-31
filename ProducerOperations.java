interface ProductOperations {
    void displayProductInfo();
    boolean checkNameMatch(String name);
    void updateType(String newType);
}

interface ProducerOperations {
    void updateProducer(String newProducer);
}
