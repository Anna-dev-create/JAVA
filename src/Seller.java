public class Seller {
    public interface seller{
        void sellComputer();
    }
    public class Jingdong implements seller{
        private Consumer Jennie;
        public void setConsumer(Consumer consumer){
            this.Jennie=Consumer;
        }
        @Override
        public void sellComputer() {
Computer computerForJennie=new Computer("电脑");
System.out.println("京东将"+computerForJennie+"发货给Jennie");
        }
    }


}
