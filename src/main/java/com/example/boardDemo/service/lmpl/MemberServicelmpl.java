package com.example.boardDemo.service.lmpl;

import com.example.boardDemo.domain.Member;
import com.example.boardDemo.dto.MemberFormDTO;
import com.example.boardDemo.repository.MemberRepository;
import com.example.boardDemo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service //서비스 선언
@RequiredArgsConstructor //밑에 memberRepository의 생성자를 쓰지 않기 위해

public class MemberServicelmpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public Long join(MemberFormDTO memberFormDTO){
        Member member = Member.builder()
                .email(memberFormDTO.getEmail())
                .username(memberFormDTO.getUsername())
                .password(memberFormDTO.getPassword())
                .build();

        return memberRepository.save(member).getId();
    }
}
