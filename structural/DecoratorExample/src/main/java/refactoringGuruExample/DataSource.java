package refactoringGuruExample;

/**
 * This is the element that will be decorated.
 * The object that will be wrapped.
 *
 * This interface contains operations that can be altered by decorators.
 *
 */

public interface DataSource {

    public void writeData(String data);
    public String readData();
}
