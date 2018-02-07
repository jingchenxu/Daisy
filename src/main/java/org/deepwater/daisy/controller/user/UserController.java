package org.deepwater.daisy.controller.user;

import org.deepwater.daisy.common.ReturnValue;
import org.deepwater.daisy.common.Tools;
import org.deepwater.daisy.entity.user.User;
import org.deepwater.daisy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/loginDo", method = RequestMethod.POST)
    @ResponseBody
    public ReturnValue loginDo(String username, String password, HttpServletRequest request, HttpServletResponse response){
        ReturnValue rtv = new ReturnValue();
        User currentUser = userService.loginByName(username);
        if(currentUser!=null){
            try {
                if(currentUser.getUserPassword().equals(Tools.EncoderByMd5(password))){
                    request.getSession().setAttribute("currentuser", currentUser);
                    Map data = new HashMap();
                    data.put("url", "home_index");
                    data.put("avator", currentUser.getUserAvator());
                    data.put("access", 1);
                    rtv.setSuccess(true);
                    rtv.setData(data);
                    rtv.setMsg("请求成功");
                } else {
                    rtv.setMsg("账户或密码错误");
                }
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else {
            rtv.setMsg("请求失败");
        }
        return rtv;
    }
}
