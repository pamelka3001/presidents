package com.presidents.controller;

import com.presidents.model.entity.President;
import com.presidents.repository.PresidentsRepository;
import com.presidents.service.president.PresidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("presidents")
@RestController
@RequiredArgsConstructor
public class PresidentsController {

    private final PresidentService presidentService;

    @GetMapping("all")
    public List<President> getAll() {
        return presidentService.getAllPresidents();
    }

    @PostMapping("save")
    public President save(@RequestBody President president) {
        return presidentService.savePresident(president);
    }

//    @PutMapping("update")
//    public String updateWithBodyOnly(@RequestBody President president) {
//        if (PresidentsDB.presidentsRepository.size() - 1 < president.getId()) {
//            president.setId(Integer.valueOf(PresidentsDB.presidentsRepository.size()).longValue());
//            PresidentsDB.presidentsRepository.add(president);
//        } else {
//            PresidentsDB.presidentsRepository.set(president.getId().intValue(), president);
//        }
//        return "Updated";
//    }
//
//    @PatchMapping("update")
//    public String updatePartial(@RequestBody President president) {
//        President p = PresidentsDB.presidentsRepository.get(Math.toIntExact(president.getId()));
//        if (president.getName() != null) {
//            p.setName(president.getName());
//        }
//        if (president.getSurname() != null) {
//            p.setSurname(president.getSurname());
//        }
//        if (president.getTermFrom() != null) {
//            p.setTermFrom(president.getTermFrom());
//        }
//        if (president.getTermTo() != null) {
//            p.setTermTo(president.getTermTo());
//        }
//        if (president.getPoliticalParty() != null) {
//            p.setPoliticalParty(president.getPoliticalParty());
//        }
//        return "Updated";
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteByIndex(@PathVariable int id){
//        PresidentsDB.presidentsRepository.remove(id);
//        return "Removed!";
//    }

}
