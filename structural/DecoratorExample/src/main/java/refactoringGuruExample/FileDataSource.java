package refactoringGuruExample;

/**
 * Concrete component, is a class of objects being wrapped.
 * It defines the basic behavior, which can be altered by decorators.
 *
 * There might be several variations of these classes in a program.
 */

public class FileDataSource implements DataSource {

    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Data written: " + data);
        /*File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/
    }

    @Override
    public String readData() {
        String data = "Reading data from a FileDataSource... ";
        System.out.println(data);
        return data;
/*        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);*/
    }
}
