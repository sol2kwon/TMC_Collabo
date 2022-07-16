package com.toomuchcoder.api.food.service;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.food.domain.Food;
import com.toomuchcoder.api.food.domain.FoodDTO;
import com.toomuchcoder.api.food.repositorie.FoodRepository;
import com.toomuchcoder.api.user.domain.Role;
import com.toomuchcoder.api.user.domain.User;
import com.toomuchcoder.api.user.domain.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

    /**
    public void analysisFood (MultipartFile multipartFile) throws Exception {
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < SIZE ; i++) {
            Food food = food.builder()
                    .age(10)
                    .name("test")
                    .telNo("123")
                    .build();
            foodRepository.save(member);
        }
        System.out.println("elapsed time : "  + (System.currentTimeMillis() - start));
    }

    @Override
    public Messenger save(FoodDTO foodDTO) {
        System.out.println("서비스로 전달된 영양소 및 칼로리 정보: "+foodDTO.toString());
        String result = "";
        if (foodRepository.findByUsername(foodDTO.).isEmpty()) {
            List<Role> list = new ArrayList<>();
            list.add(Role.USER);
            repository.save(User.builder()
                    .username(user.getUsername())
                    .name(user.getName())
                    .phone(user.getPhone())
                    .nickname(user.getNickname())
                    .password(encoder.encode(user.getPassword()))
                    .weight(user.getWeight())
                    .height(user.getHeight())
                    .gender(user.getGender())
                    .email(user.getEmail())
                    .roles(list).build());
            result = "SUCCESS";
        } else {
            result = "FAIL";
        }
        return Messenger.builder().message(result).build();
    }

    @Test
    public void saveAll_대량_성능_테스트() throws Exception {
        long start = System.currentTimeMillis();
        List<Member> members = new ArrayList<>();
        for (int i = 0 ; i < SIZE ; i++) {
            Member member = Member.builder()
                    .age(10)
                    .name("test")
                    .telNo("123")
                    .build();
            members.add(member);
        }
        memberRepository.saveAll(members);
        System.out.println("elapsed time : "  + (System.currentTimeMillis() - start));
    }일단..잠을......먼저.......자고..........하.......자....
     */
}
