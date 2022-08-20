public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        Accountant accountant = new Accountant();
        Worker worker = new Worker();

        director.setWork();
        System.out.println(Director.getWork());

        accountant.setWork();
        System.out.println(Accountant.getWork);

        worker.setWorker();
        System.out.println(Worker.getWorker);
    }
}
