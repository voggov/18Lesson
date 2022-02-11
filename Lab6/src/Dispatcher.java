import java.util.ArrayList;
import java.util.List;

public class Dispatcher implements Channel{
    List<UsersChannel> list = new ArrayList<>();

    void addAirs(UsersChannel usersChannel){
        list.add(usersChannel);
    }

    @Override
    public void sendMessage(String mes,UsersChannel channel) {
        for (var i : list){
            if (i != channel){
                i.getMessage(mes);
            }
        }
    }
}
