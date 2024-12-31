package hello.servlet.web.springmvc.v1;

import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// @Component --> 컴포넌트 스캔을 통해 스프링 빈으로 등록
// @RequestMapping
// 위의 코드같이 작성해도 동일하게 동작한다.
@Controller
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
