package in.sujal.serviceInterface;

import java.util.List;

import in.sujal.entity.Form;
import in.sujal.entity.RegisterEntity;

import jakarta.servlet.http.HttpSession;

public interface RegisterService {

	Integer saveUser(RegisterEntity entity);

	String loginUser(String email, String password, HttpSession session);

	boolean isCodeAvailable(String useremail);

	boolean checkUser(String email);

	String forgotPassword(String userEmail, String userPassword);

	List<RegisterEntity> data();

	void deleteUser(Integer id);

    List<Form> getAllBookings();

	void deleteUserBookingByAdmin(Integer id);

	RegisterEntity findByEmail(String email);

	RegisterEntity getUserDetailsByEmail(String userEmail);
	
	

	

}
