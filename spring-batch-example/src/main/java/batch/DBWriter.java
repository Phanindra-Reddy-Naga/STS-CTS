package batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.User;
import repository.UserReposritory;

@Component 
public class DBWriter implements ItemWriter<User> {

	@Autowired
	private UserReposritory userReposritory;
	@Override
	public void write(List<? extends User> users) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Data Saved for Users: "+users);
		userReposritory.saveAll(users);
		
	}
	

}
