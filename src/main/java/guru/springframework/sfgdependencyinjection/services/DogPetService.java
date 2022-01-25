package guru.springframework.sfgdependencyinjection.services;

import guru.springframework.sfgdependencyinjection.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
@Service("PetService")
public class DogPetService implements PetService {
    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}