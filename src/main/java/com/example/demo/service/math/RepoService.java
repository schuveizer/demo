package com.example.demo.service.math;

import com.example.demo.model.gateway.PostGateway;
import com.example.demo.model.gateway.TodoGateway;
import com.example.demo.repository.unit.GatewayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class RepoService {

    private final GatewayRepository gatewayRepository;

    public TodoGateway repoTest (Integer id){
        return gatewayRepository.getTestRepository(id);
    }

    public List<PostGateway> repoPostsTest (){
        return  gatewayRepository.getPosts();
    }

    public List<PostGateway> repoPostsTestSearch (String search){
        List<PostGateway> listTest;
        listTest = gatewayRepository.getPosts();
//        String test = "stringgg";
//        Boolean test2 = test.contains("stringgg");
        listTest = listTest.stream()
                .filter(s -> s.getBody().contains(search))
                .collect(Collectors.toList());
        return listTest;
    }

    public List<PostGateway> repoPostsTestOdd (Boolean odd){
        List<PostGateway> listOdd;
        listOdd = gatewayRepository.getPosts();
//        Boolean test = true && (false || true);
//        Boolean test2 = false || false && (true &&(false || false));
//        Boolean test3 = (true && true) || (true && false);
        listOdd = listOdd.stream()
                .filter(a -> (a.getId() % 2 != 0 && odd) || (a.getId() % 2 == 0 && !odd)  )
                .collect(Collectors.toList());
        return listOdd;
    }
}
