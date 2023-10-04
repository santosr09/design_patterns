package refactoringGuruExample;

/**
 * Decorator, implements the component interface and it has a HAS-A relationship with the component interface.
 * 
 */

public abstract class DataSourceDecorator implements DataSource{

    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
