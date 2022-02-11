public class SecondAirplane implements UsersChannel{
    private Channel channel;
    private final String name = "Boeing 737";
    private String message = "";
    private Integer number = (int) (Math.random() * 10000);

    public SecondAirplane(Channel channel) {
        this.channel = channel;
    }

    public String getName() {
        return name;
    }
    public String getMsg(){
        return this.message;
    }


    @Override
    public void setMessageUp() {
        this.message = name + "- взлетает";
        channel.sendMessage(message,this);
    }

    @Override
    public void setMessageDown() {
        message = name + "- садится";
        channel.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(message);
    }
}
