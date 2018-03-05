package rent.service;

public interface RegisterService {
	 public boolean checkname(String username);

	public void saveInfo(String username,String password,String phoneNumber,String realName,String idetityPic);
}
