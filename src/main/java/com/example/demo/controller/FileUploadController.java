package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {

    @RequestMapping("/fileUpload")
    public String fileUpload(MultipartFile filename, HttpServletRequest request) throws IOException {
        if(filename == null){
            return "请选择文件";
        }
        //获取上传文件名：filename.getOriginalFilename()
        String filePath = request.getSession().getServletContext().getRealPath("/upload/"+  filename.getOriginalFilename());
        System.out.println(filePath);

        filename.transferTo(new File(filePath));
        return "ok";
    }

}
