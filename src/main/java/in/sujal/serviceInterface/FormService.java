package in.sujal.serviceInterface;

import java.util.List;

import in.sujal.entity.Form;

public interface FormService {

    int save(Form form);

	void saveForm(Form formData);

	List<Form> getAllBookings();

	void deleteBooking(Integer id);

    

}
