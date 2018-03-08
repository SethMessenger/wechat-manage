package com.wxmp.wxcms.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xunbo.xu
 * @desc    用于加载内容的controller
 * @date 18/3/8
 */
@Controller
@RequestMapping("content")
public class ContentController {

    /**
     * 测试velocity的模板状态
     * @param path
     * @return
     */
    @RequestMapping("load/{path}")
    public ModelAndView testVelocity(@PathVariable(required = true, value = "path") String path){
        if(path.contains("$")){
            path.replace("$", "/");
        }
        ModelAndView mv = new ModelAndView(path);
        return mv;
    }

}
