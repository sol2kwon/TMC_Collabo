package com.toomuchcoder.api.user.repositorie;

import com.toomuchcoder.api.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.user.repository
 * fileName        : UserRepository.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/

interface UserCustomRepository {
/**
    @Modifying//1. 사용자의 비밀번호와 휴대폰 번호를 수정하시오
    @Query(value="update User u set u.password = :password, u.phone = :phone where u.userId = :userId", nativeQuery = true)
    int update(@Param("password") String password, @Param("phone") String phone);

    @Modifying//2. 사용자가 이름과 휴대폰 번호를 입력하면 아이디와 비밀번호를 찾으시오 - 만들어야함
    @Query(value="select User u set u.password = :password, u.phone = :phone where u.userId = :userId", nativeQuery = true)
    List<User> findByUsername(@Param("password") String password, @Param("phone") String phone);

    @Query(value = "")
    String login(User user);
 */

@Query(value = "select u.username from User u where u.name = :name and u.phone = :phone")
String findUsername(@Param("name") String name, @Param("phone") String phone);

}
@Repository
public interface UserRepository extends JpaRepository<User,Long>,UserCustomRepository {
    Optional<User> findByUsername(String username);
    //Messenger update(User user);
    Optional<User> findByToken(String token);

    Optional<User> findByWeight(String weight);

    boolean existsByPhone(String phone);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByNickname(String nickname);
    boolean existsByGender(String gender);
    boolean existsByHeight(String height);
    boolean existsByWeight(String weight);



}

