package refactoringGuruExample;

public class DecoratorTest {

    public static void main(String[] args) {
        DataSource dataSource1 = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("compressedEncrypted.txt")));
        dataSource1.writeData("testing1 ");
        dataSource1.readData();

        DataSource dataSource2 = new CompressionDecorator(new FileDataSource("compressed.txt"));
        dataSource2.writeData("testing2 ");
        dataSource2.readData();
    }
}
