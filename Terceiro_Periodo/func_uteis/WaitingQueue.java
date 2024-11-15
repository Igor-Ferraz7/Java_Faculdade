package func_uteis;

import java.util.LinkedList;
import java.util.Queue;

public class WaitingQueue {
    private static final int NUM_SERVERS = 3;

    public static void main(String[] args) {
        Queue<ClientThread> queue = new LinkedList<>();
        ServerThread[] servers = new ServerThread[NUM_SERVERS];

        for (int i = 0; i < NUM_SERVERS; i++) {
            servers[i] = new ServerThread("Server-" + (i + 1), queue);
            servers[i].start();
        }

        for (int i = 0; i < 10; i++) {
            ClientThread client = new ClientThread("Client-" + (i + 1), queue);
            client.start();
        }
    }

    private static class ClientThread extends Thread {
        private Queue<ClientThread> queue;

        public ClientThread(String name, Queue<ClientThread> queue) {
            super(name);
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                queue.add(this);
                System.out.println(getName() + " entrou na fila.");
                synchronized (queue) {
                    queue.wait();
                }
                System.out.println(getName() + " foi atendido.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class ServerThread extends Thread {
        private Queue<ClientThread> queue;

        public ServerThread(String name, Queue<ClientThread> queue) {
            super(name);
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    ClientThread client = queue.poll();
                    queue.notifyAll();
                    System.out.println(getName() + " está atendendo " + client.getName() + ".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
