package com.nikolay.basicauth.footballer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FootballerService {
    private final FootballerRepository footballerRepository;

    public List<Footballer> getFootballers() {
        return footballerRepository.findAll();
    }

    public void createFootballer(Footballer footballer) { footballerRepository.save(footballer); }

    public void updateFootballer(Long id, Footballer footballer) {
        Footballer footballer1 = footballerRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
        footballer1.setFirstName(footballer.getFirstName());
        footballer1.setLastName(footballer.getLastName());

        footballerRepository.save(footballer1);
    }

    public void deleteFootballer(Long id) {
        Footballer footballer1 = footballerRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
        footballerRepository.delete(footballer1);
    }
}
