package by.bsu.task.creator;
import by.bsu.task.entity.Matrix;
import by.bsu.task.exceptions.MatrixException;

public class MatrixCreator {
    public static void fillRandomized(Matrix t, int start, int end) {
        int v = t.getVerticalSize();
        int h = t.getHorizontalSize();
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++){
                try {
                    int value = (int)(Math.random()*(end-start) + start);
                    t.setElement(i, j, value);
                } catch (MatrixException e) {
                    /* в данном случае exception невозможен, поэтому обработка
                    отсутствует
                     */
                }
            }
        }
    }
    // public void fillFromFile(Matrix t, File f) { /* код */}
    // public void fillFromStream(Matrix t, InputStream input {/* код */}
    // public void fillFromDataBase(Matrix t, Connection conn){/* код */}
}
