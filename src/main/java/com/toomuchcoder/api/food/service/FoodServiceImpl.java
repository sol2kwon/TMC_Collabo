package com.toomuchcoder.api.food.service;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.food.domain.Food;
import com.toomuchcoder.api.food.domain.FoodDTO;
import com.toomuchcoder.api.food.repositorie.FoodRepository;
import com.toomuchcoder.api.user.domain.Role;
import com.toomuchcoder.api.user.domain.User;
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
import java.util.ArrayList;
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
    public Messenger update(FoodDTO foodDTO) {
        return null;
    }

    @Override
    public Messenger delete(FoodDTO foodDTO) {
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
    public Messenger count() {
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

        public List<>analysisFood (MultipartFile file) throws Exception {

        }
        @Transactional
        public void readObject(String storedFileName) throws IOException {
            S3Object o = amazonS3.getObject(new GetObjectRequest(bucket, storedFileName));
            S3ObjectInputStream ois = null;
            BufferedReader br = null;

            // Read the CSV one line at a time and process it.
            try {
                ois = o.getObjectContent();
                System.out.println ("ois = " + ois);
                br = new BufferedReader (new InputStreamReader(ois, "UTF-8"));

                String line;
                while ((line = br.readLine()) != null) {
                    // Store 1 record in an array separated by commas
                    String[] data = line.split(",", 0);

                    Food food = new Food(data[0], data[1]);
                    em.persist(food);
                }
            } finally {
                if(ois != null){
                    ois.close();
                }
                if(br != null){
                    br.close();
                }
            }
        }
    }



        public Messenger save(FoodDTO foodDTO) {
            System.out.println("서비스로 전달된 회원가입 정보: "+foodDTO.toString());
            result ="";

            foodRepository.save(foodDTO.builder()
                        .username(foodDTO.getUsername())
                        .name(foodDTO.getName())
                        .phone(foodDTO.getPhone())
                        .nickname(foodDTO.getNickname())
                        .password(foodDTO.encode(foodDTO.getPassword()))
                        .weight(foodDTO.getWeight())
                        .height(foodDTO.getHeight())
                        .gender(foodDTO.getGender())
                        .email(foodDTO.getEmail())
                        .roles(foodDTO).build());
                result = "SUCCESS";
            } else {
                result = "FAIL";
            }
            return Messenger.builder().message(result).build();
        }//회원가입



    }

}
