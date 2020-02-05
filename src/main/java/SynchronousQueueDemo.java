import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

/**
 * Java Program to solve Producer Consumer problem using SynchronousQueue. A
 * call to put() will block until there is a corresponding thread to take() that
 * element.
 * * @author Javin Paul
 */
public class SynchronousQueueDemo {

    static class PutThread implements Runnable{

        Exchanger<String> exchanger;
        String message;

        PutThread(Exchanger<String> ex){

            this.exchanger=ex;
            message = "Hello Java!";
        }
        public void run(){

            try{
                message=exchanger.exchange(message);
                System.out.println("PutThread has received: " + message);
            }
            catch(InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    static class GetThread implements Runnable {

        Exchanger<String> exchanger;
        String message;

        GetThread(Exchanger<String> ex) {

            this.exchanger = ex;
            message = "Hello World!";
        }

        public void run() {

            try {
                message = exchanger.exchange(message);
                System.out.println("GetThread has received: " + message);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }

        public class ListWrapper {
            public ArrayList<Integer> get() {
                return arrayList;
            }

            public void set(ArrayList<Integer> arrayList) {
                this.arrayList = arrayList;
            }

            ArrayList<Integer> arrayList = new ArrayList<>();
        }

        public void zip(Stream<Integer> firstStream, Stream<Integer> secondStream) {
            final SynchronousQueue queue = new SynchronousQueue(true);
            Thread firstStreamThread = new Thread("First Stream Thread") {
                public void run() {
                    Stream<Integer> resultStream = Stream.empty();
                    ListWrapper resultList = new ListWrapper();
                    firstStream.peek(x -> {
                        resultList.get().add(x);
                        try {
                            queue.put(resultList);
                            resultList.set((ArrayList<Integer>) queue.take());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }).forEach(x -> System.out.println(resultList.get().size()));
                }
            };

            Thread secondStreamThread = new Thread("Second Stream Thread") {
                public void run() {
                    ListWrapper resultList = new ListWrapper();
                    secondStream.peek(x -> {
                        try {
                            resultList.set((ArrayList<Integer>) queue.take());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        resultList.get().add(x);
                        try {
                            queue.put(resultList);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }).close();
                }
            };
            firstStreamThread.start();
            secondStreamThread.start();


        }

        public static void main(String[] args) {

            Exchanger<String> ex = new Exchanger<String>();
            new Thread(new PutThread(ex)).start();
            new Thread(new GetThread(ex)).start();

            final SynchronousQueue queue = new SynchronousQueue(true);
            Thread producer = new Thread("PRODUCER") {
                public void run() {
                    String event = "FOUR";
                    try {
                        queue.put(event); // thread will block here
                        System.out.printf("[%s] published event : %s %n", Thread.currentThread()
                                .getName(), event);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };


            Thread consumer = new Thread("CONSUMER") {
                public void run() {
                    try {
                        String event = (String) queue.take(); // thread will block here
                        System.out.printf("[%s] consumed event : %s %n", Thread.currentThread()
                                .getName(), event);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };


            producer.start(); // starting publisher thread
            consumer.start(); // starting consumer thread
           // SynchronousQueueDemo SQD = new SynchronousQueueDemo();
            //SQD.zip(Stream.of(1, 2, 3), Stream.of(4, 5, 6));

        }
    }}