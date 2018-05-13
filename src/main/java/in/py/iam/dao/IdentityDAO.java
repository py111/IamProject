package in.py.iam.dao;

import in.py.iam.datamodel.Identity;
import java.util.List;

public interface IdentityDAO {
	
	public void save(Identity identity); 
	public void delete(Identity identity); 
	public void update(Identity identity); 
	public List<Identity> getList();  
	public List<Identity> search(Identity identity);
	public boolean checkUser(Identity identity);
}
