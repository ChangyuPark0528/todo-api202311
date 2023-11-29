package com.example.todo.userapi.dto.response;

import com.example.todo.userapi.entity.User;
import lombok.*;

import java.time.LocalDate;

// 로그인 성공 후 클라이언트에게 전송할 데이터 객체

@Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
public class LoginResponseDTO {

    private String email;
    private String userName;

    private LocalDate joinData;

    private String token; // 인증 토큰
    private String role; // 권한



    public LoginResponseDTO(User user, String token) {
        this.email = user.getEmail();
        this.userName = user.getUserName();
        this.joinData = LocalDate.from(user.getJoinDate());
        this.token = token;
        this.role = String.valueOf(user.getRole());

    }
}
