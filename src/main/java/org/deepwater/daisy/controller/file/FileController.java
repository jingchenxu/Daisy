package org.deepwater.daisy.controller.file;

import com.alibaba.fastjson.JSONObject;
import org.deepwater.daisy.common.ReturnValue;
import org.deepwater.daisy.common.Tools;
import org.deepwater.daisy.entity.blog.Image;
import org.deepwater.daisy.mapper.blog.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
public class FileController {

    @Value("${daisy.linux.imageroute}")
    private String linuxImageRoute;

    @Value("${daisy.windows.imageroute}")
    private String windowsImageRoute;

    @Value("${server.servlet.context-path}")
    private String path;

    @Autowired
    private ImageMapper imageMapper;

    @RequestMapping("/fileUpload")
    @ResponseBody
    public ReturnValue fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        ReturnValue rtv = new ReturnValue();
        String imageRoute = linuxImageRoute;
        if(Tools.isOSLinux()){
            imageRoute = linuxImageRoute;
        } else {
            imageRoute = windowsImageRoute;
        }
        String fileName = file.getOriginalFilename();
        String fileType = file.getContentType();
        System.out.println("文件名称："+fileName+"文件类型："+fileType);
        try {
            Tools.uploadFile(file.getBytes(), imageRoute, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Image image = new Image();
        image.setImageCreatetime(new Date());
        image.setImageCreator("jcxu");
        image.setImageDescription("");
        image.setImageIsIndex(true);
        image.setImageIsRemote(false);
        image.setImageName(fileName);
        image.setImageType(fileType);
        image.setImageUrl(path+"/"+fileName);
        image.setImageNumber(Tools.CreateID("IM"));
        imageMapper.insert(image);
        JSONObject data = new JSONObject();
        data.put("imgUrl", path+"/"+fileName);
        data.put("imgname", fileName);
        rtv.setData(data);
        rtv.setSuccess(true);
        rtv.setMsg("图片上传成功");
        return rtv;
    }

    @RequestMapping("/showTest")
    @ResponseBody
    public ReturnValue showTest() {
        ReturnValue rtv = new ReturnValue();
        return rtv;
    }
}
