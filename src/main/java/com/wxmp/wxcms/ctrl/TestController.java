package com.wxmp.wxcms.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created With IntelliJ IDEA.
 * Creater: Seth.Hsu
 * Date: 2018/3/7
 * Time: 23:48
 * Description:
 */
@Controller
@RequestMapping("test")
public class TestController {

    /**
     * 测试velocity的模板状态
     * @param model
     * @param parma
     * @return
     */
    @RequestMapping("velocity")
    public String testVelocity(Model model,
            @RequestParam(required = true, value = "param") String parma){
        model.addAttribute("parma", parma);
        return "test";
    }

}
