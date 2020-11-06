public class Consumer {
    public interface consumer{
        void getcomputer(Computer computer);
    }
    public class Jennie implements Consumer{
        @Override
        public void getcomputer(Computer computer){
            System.out.println("Jennie 拿到了"+computer.name);
        }
    }
}
