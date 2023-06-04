package com.myproject.project_ttn_alt.cervice;

import com.myproject.project_ttn_alt.entityTtn.EntityTtn;
import com.myproject.project_ttn_alt.repository.TtnInRepository;
import com.myproject.project_ttn_alt.validation.TtnValidationService;

import java.util.Scanner;

public class TtnService {
    private TtnInRepository repository = new TtnInRepository();
    private TtnValidationService ttnValidationService = new TtnValidationService();

    public Integer createTtn(EntityTtn entityTtn){
        ttnValidationService.validate(entityTtn);
        EntityTtn createTtn = repository.insertEntityTtn(entityTtn);
        return createTtn.getId();
    }

    public EntityTtn findTtnId(Integer id){
        return repository.findEntityTtnId(id);
    }

    public EntityTtn findTtnName(String name){
        return repository.findEntityTtnId(repository.findKeyName(name));
    }

    public void findAllSizeTtn(){
        int sizeTtn = repository.getEntityTtnMapSize();
        for (int i = 0; i < sizeTtn; i++) {
            EntityTtn entityTtn = findTtnId(i);
            System.out.println(entityTtn);
        }
    }

    public void updateListOrderTtn(){
        System.out.println("Enter name Order: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        System.out.println("updateListOrderTtn = " + name);

    }
}
