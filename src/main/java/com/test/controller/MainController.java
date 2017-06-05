package com.test.controller;

import com.test.model.ModelBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lijie on 17/5/16.
 */
@Controller
public class MainController {

    @RequestMapping("/list")
    public Map<String, Object> test(HttpServletRequest request) {
        String page = request.getParameter("page");
        int pageNo = page == null ? 1 : Integer.valueOf(page);
        List<ModelBean> result = new ArrayList<ModelBean>();
        Map<String, Object> resultMap = new HashMap<String, Object>();
        int count = pageNo + 20;
        for(int i = pageNo ; i < count; ++i) {
            ModelBean bean = new ModelBean();
            bean.setAddress(String.valueOf(i));
            bean.setName(String.valueOf(i) + "_test");
            result.add(bean);
        }
        resultMap.put("data", result);
        return resultMap;
    }

    @RequestMapping("/default")
    public String test(HttpServletRequest request, Model model) {
        return "test";
    }


}
