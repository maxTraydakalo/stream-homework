import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class CallableStream <T> implements Callable <Stream<T>> {
        private long waitTime;

        public CallableStream(Stream<T> stream) {
            if (stream.findFirst().isPresent()){

            };
        }

        @Override
        public Stream<T> call() throws Exception {
            Thread.sleep(waitTime);
            // возвращает имя потока, который выполняет этот callable таск
            return null;
        }


}
