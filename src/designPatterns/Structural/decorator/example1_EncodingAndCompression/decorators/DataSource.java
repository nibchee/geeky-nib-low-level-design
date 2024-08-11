package designPatterns.Structural.decorator.example1_EncodingAndCompression.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
