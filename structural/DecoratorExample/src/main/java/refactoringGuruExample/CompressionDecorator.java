package refactoringGuruExample;

public class CompressionDecorator extends DataSourceDecorator{
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data + "... COMPRESSED data");
    }

    @Override
    public String readData() {
        return super.readData() + " ...D E C O M P R E S S E D data";
    }
}
