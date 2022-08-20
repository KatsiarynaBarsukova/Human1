public class Director extends Person {
    private String work;
    @Override
    public void getWork() {
        return work();
    }
    @Override
    public void set.Work() {
        this.work = work;
    }
    public void work(){
        System.out.println("Director");
    }
}
