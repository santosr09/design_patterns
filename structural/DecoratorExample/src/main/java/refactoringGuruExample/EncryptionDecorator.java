package refactoringGuruExample;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data + "... 3NCRYPT3D data");
    }

    @Override
    public String readData() {
        return super.readData() + " ...DECRYPTED data";
    }
}
