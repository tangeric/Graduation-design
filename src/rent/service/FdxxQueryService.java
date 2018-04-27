package rent.service;

import java.util.List;

import rent.model.FdModel;

public interface FdxxQueryService {

	public List<FdModel> fdxxQuery();
	
	public void fdxxDelete(String fd_id);
}
