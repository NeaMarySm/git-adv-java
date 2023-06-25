package exceptions_1;

import java.io.Closeable;
import java.io.IOException;

public class Counter implements Closeable {
    public int counter = 0;
    private boolean closed = false;

    public void add() throws IOException {
        if (!closed) {
            counter++;
        } else {
            throw new IOException();
        }

    }

    @Override
    public void close() {
        closed = true;
    }
}
