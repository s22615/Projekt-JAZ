package com.edu.pjatk.demo;

import com.edu.pjatk.demo.data.adress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Test {
    TestRepository testRepository;

    @Autowired
    public Test(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping("/test")
    public String test(){
        List<adress> test1 = testRepository.findBymiasto("Radom");
        for (adress adress : test1) {
            System.out.println(adress.id_adres);
        }
        return "";
    }


}
