package Model;

public class CheckLoginBO {
		CheckLoginDAO checkLoginDAO = new CheckLoginDAO();
		public boolean isValidUser(String username,String password) {
			
			return checkLoginDAO.isExistUser(username, password);
		}
}
