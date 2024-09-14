package in.sujal.serviceInterface;



import java.util.List;

import in.sujal.entity.EventsEntity;
import in.sujal.entity.Form;

public interface EventServiceInterface {

   // public String loadEvent(String eventCategory);
   public EventsEntity loadEventData(String eventCategory);

public List<Form> getUserEvents(String email);

public void deleteUserBooking(Integer id);

}
