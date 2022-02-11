public class FirstAir implements UsersChannel {
    private Channel channel;
    private  final String name = "LA - 5";
    private String message;
    private Integer number = (int) (Math.random() * 10000);

    public FirstAir(Channel channel) {
        this.channel = channel;
    }


    public String getName() {
        return name;
    }


    @Override
    public void setMessageUp() {
        message = name + "- взлетает";
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
