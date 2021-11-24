public class printn extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i!=6){
                System.out.println(i);
            }
            else{
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
    }
}
