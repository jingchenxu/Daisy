package org.deepwater.daisy.controller.file;

import org.deepwater.daisy.common.ReturnValue;
import org.deepwater.daisy.common.Tools;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
public class FileController {

    @Value("${daisy.linux.imageroute}")
    private String linuxImageRoute;

    @Value("${daisy.windows.imageroute}")
    private String windowsImageRoute;

    @RequestMapping("/fileUpload")
    @ResponseBody
    public ReturnValue fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String imageRoute = linuxImageRoute;
        if(Tools.isOSLinux()){
            imageRoute = linuxImageRoute;
        } else {
            imageRoute = windowsImageRoute;
        }
        ReturnValue rtv = new ReturnValue();
        return rtv;
    }
}
