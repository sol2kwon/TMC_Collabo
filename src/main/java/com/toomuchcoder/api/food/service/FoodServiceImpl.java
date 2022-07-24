package com.toomuchcoder.api.food.service;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.food.domain.Food;
import com.toomuchcoder.api.food.domain.FoodDTO;
import com.toomuchcoder.api.food.repositorie.FoodRepository;
import com.toomuchcoder.api.user.domain.UserDTO;
import lombok.RequiredArgsConstructor;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {
    private final FoodRepository foodRepository;
    @Override
    public List<Food> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Food> findAll() {
        return null;
    }

    @Override
    public List<Food> findAllFood() {
        return null;
    }

    @Override
    public Messenger update(FoodDTO foodDTO) {
        return null;
    }

    @Override
    public Messenger delete(FoodDTO foodDTO) {
        return null;
    }

    @Override
    public Messenger save(FoodDTO foodDTO) {
        return null;
    }


    @Override
    public Messenger existsById(String foodid) {
        return null;
    }

    @Override
    public Messenger deleteAll() {
        return null;
    }

    @Override
    public Messenger chartList(FoodDTO foodDTO) {
        if (foodRepository.findByFoodname(foodDTO.getFoodname()).equals())
        return null;
    }


    public void analysisFood (MultipartFile file) throws Exception {
        String url = "http://localhost:8080/savemultipart";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);

        HttpEntity httpEntity = MultipartEntityBuilder.create()
                //.addTextBody("name", "Dongwoo")
                //.addTextBody("nickname", "Victor")
                .addBinaryBody("file",
                        new File("/Users/amorf/test/testtest.txt"),
                        ContentType.MULTIPART_FORM_DATA,
                        "testtest.txt")
                .build();

        httpPost.setEntity(httpEntity);

        CloseableHttpResponse response = httpClient.execute(httpPost);

        System.out.println("=========================== start ============================");
        System.out.println("Status Code: " + response.getStatusLine().getStatusCode());
        System.out.println("============================ end =============================");
        httpClient.close();
    }}
//**}



